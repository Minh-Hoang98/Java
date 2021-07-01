import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

public class DepartmentManager extends JFrame {

    String fileName = "department.txt";
    
    DefaultMutableTreeNode curDepNode, curEmpNode, root;
    DefaultTreeModel model;
    
    boolean addNewDep = false, addNewEmp = false;

    public DepartmentManager() {
        initComponents();
        model = (DefaultTreeModel) tree.getModel();
        root = (DefaultMutableTreeNode) model.getRoot();
        root.setUserObject("Department");
        
        loadDataFromFile();
        model.reload();
    }

    private void loadDataFromFile() {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String details;
            while ((details = br.readLine()) != null) {
                if (details.contains("-")) {
                    String[] words = details.split("-", 2);
                    curDepNode = new DefaultMutableTreeNode(new Department(words[0].trim(), words[1].trim()));
                    root.add(curDepNode);
                }
                if (details.contains(",")) {
                    String[] words = details.split(",", 3);
                    curDepNode.add(new DefaultMutableTreeNode(new Employee(words[0].trim(), words[1].trim(), words[2].trim())));
                }
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            // Handle
        }
    }
                    
    private void initComponents() {
        lblStatus       = new JLabel();
        pnlTree         = new JScrollPane();
        tree            = new JTree();
        btnSaveToFile   = new JButton();
        btnRemove       = new JButton();
        pnlDepartment   = new JPanel();
        lblDepCode      = new JLabel();
        lblDepName      = new JLabel();
        txtDepCode      = new JTextField();
        txtDepName      = new JTextField();
        btnDepAdd       = new JButton();
        btnDepClear     = new JButton();
        btnDepNew       = new JButton();
        pnlEmployee     = new JPanel();
        lblEmpCode      = new JLabel();
        lblEmpName      = new JLabel();
        lblEmpSalary    = new JLabel();
        txtEmpCode      = new JTextField();
        txtEmpName      = new JTextField();
        txtEmpSalary    = new JTextField();
        btnEmpClear     = new JButton();
        btnEmpAdd       = new JButton();
        btnEmpNew       = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblStatus.setText("STATUS: ");

        DefaultMutableTreeNode treeNode1 = new DefaultMutableTreeNode("root");
        tree.setModel(new DefaultTreeModel(treeNode1));
        tree.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                treeMouseClicked();
            }
        });
        pnlTree.setViewportView(tree);

        btnSaveToFile.setText("Save to file");
        btnSaveToFile.addActionListener((e) -> btnSaveToFileActionPerformed());

        btnRemove.setText("Remove");
        btnRemove.addActionListener((e) -> btnRemoveActionPerformed());

        pnlDepartment.setBorder(
            BorderFactory.createTitledBorder(
                null,
                "Department Details",
                TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_POSITION,
                new Font("Lucida Grande", 1, 14)
            )
        );

        lblDepCode.setText("Dept Code");

        lblDepName.setText("Dept Name");

        txtDepCode.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                txtDepCodeKeyReleased();
            }
        });

        txtDepName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                txtDepNameKeyReleased();
            }
        });

        btnDepAdd.setText("Add");
        btnDepAdd.setEnabled(false);
        btnDepAdd.addActionListener((e) -> btnDepAddActionPerformed());

        btnDepClear.setText("Clear");
        btnDepClear.setEnabled(false);
        btnDepClear.addActionListener((e) -> btnDepClearActionPerformed());

        btnDepNew.setText("New");
        btnDepNew.addActionListener((e) -> btnDepNewActionPerformed());

        GroupLayout pnlDepartmentLayout = new GroupLayout(pnlDepartment);
        pnlDepartment.setLayout(pnlDepartmentLayout);
        pnlDepartmentLayout.setHorizontalGroup(
            pnlDepartmentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlDepartmentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDepartmentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblDepCode)
                    .addComponent(lblDepName)
                    .addComponent(btnDepNew))
                .addGap(10, 10, 10)
                .addGroup(pnlDepartmentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtDepCode)
                    .addGroup(pnlDepartmentLayout.createSequentialGroup()
                        .addComponent(btnDepClear)
                        .addPreferredGap(
                            LayoutStyle.ComponentPlacement.RELATED,
                            67,
                            Short.MAX_VALUE
                        )
                        .addComponent(btnDepAdd))
                    .addComponent(txtDepName))
                .addContainerGap())
        );
        pnlDepartmentLayout.setVerticalGroup(
            pnlDepartmentLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlDepartmentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDepartmentLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepCode)
                    .addComponent(
                        txtDepCode,
                        GroupLayout.PREFERRED_SIZE,
                        GroupLayout.DEFAULT_SIZE,
                        GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGap(10, 10, 10)
                .addGroup(pnlDepartmentLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepName)
                    .addComponent(
                        txtDepName,
                        GroupLayout.PREFERRED_SIZE,
                        GroupLayout.DEFAULT_SIZE,
                        GroupLayout.PREFERRED_SIZE
                    )
                )
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDepartmentLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDepAdd)
                    .addComponent(btnDepClear)
                    .addComponent(btnDepNew))
                .addContainerGap())
        );

        pnlEmployee.setBorder(
            BorderFactory.createTitledBorder(
                null,
                "Employee Details",
                TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_POSITION,
                new Font("Lucida Grande", 1, 14)
            )
        );

        lblEmpCode.setText("Emp Code");

        lblEmpName.setText("Emp Name");

        lblEmpSalary.setText("Emp Salary");

        txtEmpCode.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                txtEmpCodeKeyReleased();
            }
        });

        txtEmpName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                txtEmpNameKeyReleased();
            }
        });

        txtEmpSalary.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                txtEmpSalaryKeyReleased();
            }
        });

        btnEmpClear.setText("Clear");
        btnEmpClear.setEnabled(false);
        btnEmpClear.addActionListener((e) -> btnEmpClearActionPerformed());

        btnEmpAdd.setText("Add");
        btnEmpAdd.setEnabled(false);
        btnEmpAdd.addActionListener((e) -> btnEmpAddActionPerformed());

        btnEmpNew.setText("New");
        btnEmpNew.addActionListener((e) -> btnEmpNewActionPerformed());

        GroupLayout pnlEmployeeLayout = new GroupLayout(pnlEmployee);
        pnlEmployee.setLayout(pnlEmployeeLayout);
        pnlEmployeeLayout.setHorizontalGroup(
            pnlEmployeeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEmployeeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmpCode)
                    .addComponent(lblEmpName)
                    .addComponent(lblEmpSalary)
                    .addComponent(btnEmpNew))
                .addGap(10, 10, 10)
                .addGroup(pnlEmployeeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEmployeeLayout.createSequentialGroup()
                        .addComponent(btnEmpClear)
                        .addPreferredGap(
                            LayoutStyle.ComponentPlacement.RELATED,
                            GroupLayout.DEFAULT_SIZE,
                            Short.MAX_VALUE
                        )
                        .addComponent(btnEmpAdd))
                    .addComponent(txtEmpName)
                    .addComponent(txtEmpSalary, GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmpCode))
                .addContainerGap())
        );
        
        pnlEmployeeLayout.setVerticalGroup(
            pnlEmployeeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEmployeeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpCode)
                    .addComponent(
                        txtEmpCode,
                        GroupLayout.PREFERRED_SIZE,
                        GroupLayout.DEFAULT_SIZE,
                        GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGap(10, 10, 10)
                .addGroup(pnlEmployeeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpName)
                    .addComponent(
                        txtEmpName,
                        GroupLayout.PREFERRED_SIZE,
                        GroupLayout.DEFAULT_SIZE,
                        GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGap(10, 10, 10)
                .addGroup(pnlEmployeeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpSalary)
                    .addComponent(
                        txtEmpSalary,
                        GroupLayout.PREFERRED_SIZE,
                        GroupLayout.DEFAULT_SIZE,
                        GroupLayout.PREFERRED_SIZE
                    )
                )
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEmployeeLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmpAdd)
                    .addComponent(btnEmpClear)
                    .addComponent(btnEmpNew))
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSaveToFile)
                        .addPreferredGap(
                            LayoutStyle.ComponentPlacement.RELATED,
                            GroupLayout.DEFAULT_SIZE,
                            Short.MAX_VALUE
                        )
                        .addComponent(btnRemove))
                    .addComponent(lblStatus)
                    .addComponent(
                        pnlTree,
                        GroupLayout.PREFERRED_SIZE,
                        308,
                        GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(
                        pnlDepartment,
                        GroupLayout.DEFAULT_SIZE,
                        GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE
                    )
                    .addComponent(
                        pnlEmployee,
                        GroupLayout.DEFAULT_SIZE,
                        GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE
                    )
                )
                .addGap(10, 10, 10))
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStatus)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(
                            pnlTree,
                            GroupLayout.PREFERRED_SIZE,
                            0,
                            Short.MAX_VALUE
                        )
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSaveToFile)
                            .addComponent(btnRemove)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(
                            pnlDepartment,
                            GroupLayout.PREFERRED_SIZE,
                            GroupLayout.DEFAULT_SIZE,
                            GroupLayout.PREFERRED_SIZE
                        )
                        .addGap(20, 20, 20)
                        .addComponent(
                            pnlEmployee,
                            GroupLayout.PREFERRED_SIZE,
                            GroupLayout.DEFAULT_SIZE,
                            GroupLayout.PREFERRED_SIZE
                        )
                    )
                )
                .addGap(20, 20, 20))
        );

        pack();
    }                      

    private void btnDepAddActionPerformed() {                                          
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
        String depCode = txtDepCode.getText().trim().toUpperCase();
        String depName = txtDepName.getText().trim();
        Department newDep = new Department(depCode, depName);

        if (addNewDep) {
            model.insertNodeInto(new DefaultMutableTreeNode(newDep), root, root.getChildCount());
            lblStatus.setText("STATUS: NEW DEPARTMENT ADDED TO TREE!");
        } else {
            if (selectedNode == null || selectedNode.getLevel() != 1) {
                JOptionPane.showMessageDialog(this, "If you want to \nEdit: Please select a department\nAdd: Please click on the New button first", "INSTRUCTION", JOptionPane.INFORMATION_MESSAGE);
            } else {
                ((Department) curDepNode.getUserObject()).setDepName(depName);
                this.tree.updateUI();
            }
        }

        txtDepCode.setText("");
        txtDepName.setText("");
        btnDepAdd.setEnabled(false);
        btnDepClear.setEnabled(false);
        addNewDep = false;
    }                                         

    private void btnDepClearActionPerformed() {                                            
        if (addNewDep) {
            txtDepCode.setText("");
        }
        txtDepName.setText("");
        btnDepAdd.setEnabled(false);
        btnDepClear.setEnabled(false);
    }                                           

    private void txtDepCodeKeyReleased() {
        String depCode = txtDepCode.getText().trim();
        String depName = txtDepName.getText().trim();

        if (!depCode.isEmpty() && !depName.isEmpty()) {
            btnDepAdd.setEnabled(true);
        } else if (depCode.isEmpty() && depCode.isEmpty()) {
            btnDepClear.setEnabled(false);
        } else {
            btnDepClear.setEnabled(true);
            btnDepAdd.setEnabled(false);
        }
    }                                      

    private void txtDepNameKeyReleased() {                                       
        if (addNewDep) {
            txtDepCodeKeyReleased();
        } else {
            if (txtDepName.getText().trim().isEmpty()) {
                btnDepClear.setEnabled(false);
                btnDepAdd.setEnabled(false);
            } else {
                btnDepClear.setEnabled(true);
                btnDepAdd.setEnabled(true);
            }
        }
    }                                      

    private void btnEmpAddActionPerformed() {                                          
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
        
        String empCode = txtEmpCode.getText().trim().toUpperCase();
        String empName = txtEmpName.getText().trim();
        String empSalary = txtEmpSalary.getText().trim();
        
        Employee newEmp = new Employee(empCode, empName, empSalary);

        if (selectedNode != null && curDepNode != null) {
            if (addNewEmp) {
                model.insertNodeInto(new DefaultMutableTreeNode(newEmp), curDepNode, curDepNode.getChildCount());
                lblStatus.setText("STATUS: NEW EMPLOYEE ADDED TO TREE!");
            } else if (selectedNode.getLevel() == 2) {
                ((Employee) curEmpNode.getUserObject()).setEmpName(empName);
                ((Employee) curEmpNode.getUserObject()).setEmpSalary(empSalary);
                this.tree.updateUI();
            }
        } else {
            JOptionPane.showMessageDialog(this, "If you want to \nEdit: Please select an employee\nAdd: Please pick a department then click on the New button first", "INSTRUCTION", JOptionPane.INFORMATION_MESSAGE);
        }

        txtEmpCode.setText("");
        txtEmpName.setText("");
        txtEmpSalary.setText("");
        btnEmpAdd.setEnabled(false);
        btnEmpClear.setEnabled(false);
        addNewEmp = false;
    }                                         

    private void btnEmpClearActionPerformed() {                                            
        txtEmpCode.setText("");
        txtEmpName.setText("");
        txtEmpSalary.setText("");
        btnEmpAdd.setEnabled(false);
        btnEmpClear.setEnabled(false);
    }                                           

    private void txtEmpCodeKeyReleased() {
        String empCode = txtEmpCode.getText().trim();
        String empName = txtEmpName.getText().trim();
        String empSalary = txtEmpSalary.getText().trim();
        
        if (!empCode.isEmpty() && !empName.isEmpty() && !empSalary.isEmpty()) {
            btnEmpAdd.setEnabled(true);
        } else if (empCode.isEmpty() && empName.isEmpty() && empSalary.isEmpty()) {
            btnEmpClear.setEnabled(false);
        } else {
            btnEmpClear.setEnabled(true);
            btnEmpAdd.setEnabled(false);
        }
    }                                      

    private void txtEmpNameKeyReleased() {                                       
        if (addNewEmp) {
            txtEmpCodeKeyReleased();
        } else {
            String empName = txtEmpName.getText().trim();
            String empSalary = txtEmpSalary.getText().trim();

            if (!empName.isEmpty() && !empSalary.isEmpty()) {
                btnEmpAdd.setEnabled(true);
            } else if (empName.isEmpty() && empSalary.isEmpty()) {
                btnEmpClear.setEnabled(false);
            } else {
                btnEmpClear.setEnabled(true);
                btnEmpAdd.setEnabled(false);
            }
        }
    }                                      

    private void txtEmpSalaryKeyReleased() {                                         
        txtEmpNameKeyReleased();
    }                                        

    private void btnRemoveActionPerformed() {                                          
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            if (selectedNode.getLevel() == 1) {
                if (this.curDepNode.getChildCount() > 0) {
                    JOptionPane.showMessageDialog(this, "Remove all employees before deleting a department", "ERROR", JOptionPane.ERROR_MESSAGE);
                } else {
                    int reply = JOptionPane.showConfirmDialog(this, "Delete this department? ", "DELETE", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                        model.removeNodeFromParent(selectedNode);
                        lblStatus.setText("STATUS: REMOVED A DEPARTMENT FROM LIST!");
                    }
                }
            } else if (selectedNode.getLevel() == 2) {
                int reply = JOptionPane.showConfirmDialog(this, "Delete this employee? ", "DELETE", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    model.removeNodeFromParent(selectedNode);
                    lblStatus.setText("STATUS: REMOVED A EMPLOYEE FROM LIST!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No node is selected", "ERROR", JOptionPane.ERROR_MESSAGE);
            lblStatus.setText("STATUS: PLEASE SELECT A NODE!");
        }
    }                                         

    private void btnSaveToFileActionPerformed() {                                              
        try {
            File file = new File(fileName);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
            file.createNewFile();
        } catch (IOException e) {
            // Handle
        }
        showAllNodes(root);
        lblStatus.setText("STATUS: SAVED TO FILE!");
    }                                             

    private void treeMouseClicked() {                                  
        try {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
            Object selectedObj = selectedNode.getUserObject();
            if (selectedNode == root) {
                this.curDepNode = null;
                this.curEmpNode = null;
            } else {
                if (selectedObj instanceof Department) {
                    this.curDepNode = selectedNode;
                    this.curEmpNode = null;
                } else if (selectedObj instanceof Employee) {
                    this.curDepNode = (DefaultMutableTreeNode) selectedNode.getParent();
                    this.curEmpNode = selectedNode;
                }
            }
        } catch (NullPointerException e) {
            return;
        }
        addNewDep = false;
        addNewEmp = false;
        viewDepAndEmp();
    }                                 

    private void btnDepNewActionPerformed() {                                          
        addNewDep = true;
        txtDepCode.setText("");
        txtDepCode.setText("");
        txtDepName.setText("");
        txtEmpCode.setText("");
        txtEmpName.setText("");
        txtEmpSalary.setText("");
        txtDepCode.setEditable(true);
        txtDepCode.requestFocus();
    }                                    

    private void btnEmpNewActionPerformed() {                                          
        addNewEmp = true;
        txtEmpCode.setText("");
        txtEmpName.setText("");
        txtEmpSalary.setText("");
        txtEmpCode.setEditable(true);
        txtEmpCode.requestFocus();
    }                                         

    private void showAllNodes(DefaultMutableTreeNode node) {
        try {
            FileWriter fw = new FileWriter(fileName, true);
            PrintWriter pw = new PrintWriter(fw);
            String detail;
            switch (node.getLevel()) {
                case 1:
                    Department dep = (Department) node.getUserObject();
                    detail = dep.getDepCode() + " - " + dep.getDepName();
                    pw.println(detail);
                    break;
                case 2:
                    Employee emp = (Employee) node.getUserObject();
                    detail = emp.getEmpCode() + ", " + emp.getEmpName() + ", " + emp.getEmpSalary();
                    pw.println(detail);
                    break;
                default:
                    break;
            }
            pw.close();
            fw.close();
            for (int i = 0; i < node.getChildCount(); i++) {
                showAllNodes((DefaultMutableTreeNode) node.getChildAt(i));
            }
        } catch (IOException e) {
        }
    }

    private void viewDepAndEmp() {
        Department curDep = null;
        Employee curEmp = null;
        if (curDepNode != null) {
            curDep = (Department)curDepNode.getUserObject();
        }
        if (curEmpNode != null) {
            curEmp = (Employee)curEmpNode.getUserObject();
        }
        this.txtDepCode.setText(curDep != null ? curDep.getDepCode() : "");
        this.txtDepName.setText(curDep != null ? curDep.getDepName() : "");
        this.txtEmpCode.setText(curEmp != null ? curEmp.getEmpCode() : "");
        this.txtEmpName.setText(curEmp != null ? curEmp.getEmpName() : "");
        this.txtEmpSalary.setText(curEmp != null ? curEmp.getEmpSalary() : "");
        this.txtDepCode.setEditable(false);
        this.txtEmpCode.setEditable(false);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new DepartmentManager().setVisible(true);
        });
    }
                   
    private JButton btnDepAdd;
    private JButton btnDepClear;
    private JButton btnDepNew;
    private JButton btnEmpAdd;
    private JButton btnEmpClear;
    private JButton btnEmpNew;
    private JButton btnRemove;
    private JButton btnSaveToFile;
    private JLabel lblDepCode;
    private JLabel lblDepName;
    private JLabel lblEmpCode;
    private JLabel lblEmpName;
    private JLabel lblEmpSalary;
    private JLabel lblStatus;
    private JPanel pnlDepartment;
    private JPanel pnlEmployee;
    private JScrollPane pnlTree;
    private JTree tree;
    private JTextField txtDepCode;
    private JTextField txtDepName;
    private JTextField txtEmpCode;
    private JTextField txtEmpName;
    private JTextField txtEmpSalary;
}
