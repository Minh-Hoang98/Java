package Candidate;

import java.util.ArrayList;
import java.util.Calendar;

public class Manager {

    public static int menu() {
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Internship");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validate.checkInputIntLimit(1, 5);
        return choice;
    }

    public static void createCandidate(ArrayList<Candidate> candidates,
            int type) {
        while (true) {
            System.out.print("Enter id: ");
            String id = Validate.checkInputString();
            System.out.print("Enter first name: ");
            String firstName = Validate.checkInputString();
            System.out.print("Enter last name: ");
            String lastName = Validate.checkInputString();
            System.out.print("Enter birth date: ");
            int birthDate = Validate.checkInputIntLimit(1900,
                    Calendar.getInstance().get(Calendar.YEAR));
            System.out.print("Enter address: ");
            String address = Validate.checkInputString();
            System.out.print("Enter phone: ");
            String phone = Validate.checkInputPhone();
            System.out.print("Enter email: ");
            String email = Validate.checkInputEmail();
            Candidate candidate = new Candidate(id, firstName, lastName,
                    birthDate, address, phone, email, type);
            //check id exist or not
            if (Validate.checkIdExist(candidates, id)) {
                switch (type) {
                    case 0:
                        createExperience(candidates, candidate);
                        break;
                    case 1:
                        createFresher(candidates, candidate);
                        break;
                    case 2:
                        createInternship(candidates, candidate);
                        break;
                }
            } else {
                return;
            }
            System.out.print("Do you want to continue (Y/N): ");
            //check user want to create new candidate or not
            if (!Validate.checkInputYN()) {
                return;
            }
        }
    }

    public static void createExperience(ArrayList<Candidate> candidates,
            Candidate candidate) {
        System.out.print("Enter year of experience: ");
        int yearExperience = Validate.checkInputExprience(candidate.getbDate());
        System.out.print("Enter professional skill: ");
        String professionalSkill = Validate.checkInputString();
        candidates.add(new Experience(yearExperience, professionalSkill,
                candidate.getCid(), candidate.getfName(), candidate.getlName(),
                candidate.getbDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(), candidate.getCdType()));
        System.err.println("Create success.");
    }

    public static void createFresher(ArrayList<Candidate> candidates,
            Candidate candidate) {
        System.out.print("Enter graduation date: ");
        String graDate = Validate.checkInputString();
        System.out.print("Enter graduation rank: ");
        String graRank = Validate.checkInputGraduationRank();
        System.out.print("Enter education: ");
        String edu = Validate.checkInputString();
        candidates.add(new Fresher(graDate, graRank, edu, candidate.getCid(),
                candidate.getfName(), candidate.getlName(),
                candidate.getbDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getCdType()));
        System.err.println("Create success.");
    }

    public static void createInternship(ArrayList<Candidate> candidates,
            Candidate candidate) {
        System.out.print("Enter major: ");
        String major = Validate.checkInputString();
        System.out.print("Enter semester: ");
        String semester = Validate.checkInputString();
        System.out.print("Enter university: ");
        String university = Validate.checkInputString();
        candidates.add(new Intern(major, semester, university, candidate.getCid(),
                candidate.getfName(), candidate.getlName(),
                candidate.getbDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(),
                candidate.getCdType()));
        System.err.println("Create success.");
    }

    public static void searchCandidate(ArrayList<Candidate> candidates) {
        printListNameCandidate(candidates);
        System.out.print("Enter andidate name (First name or Last name): ");
        String nameSearch = Validate.checkInputString();
        System.out.print("Enter type of candidate: ");
        int typeCandidate = Validate.checkInputIntLimit(0, 2);
        for (Candidate candidate : candidates) {
            if (candidate.getCdType() == typeCandidate
                    && candidate.getfName().contains(nameSearch)
                    || candidate.getlName().contains(nameSearch)) {
                System.out.println(candidate);
            }
        }
    }

    public static void printListNameCandidate(ArrayList<Candidate> candidates) {
        System.err.println("Experience Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Experience) {
                System.out.println(candidate.getfName() + " "
                        + candidate.getlName());
            }
        }
        System.err.println("Fresher Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Fresher) {
                System.out.println(candidate.getfName() + " "
                        + candidate.getlName());
            }
        }
        System.err.println("Internship Candidate");
        for (Candidate candidate : candidates) {
            if (candidate instanceof Intern) {
                System.out.println(candidate.getfName() + " "
                        + candidate.getlName());
            }
        }
    }
}
