/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.registration;

import java.io.Serializable;

public class RegistrationCreateErrors implements Serializable {
    private String usernameLengthErr;
    private String passwordLengthErr;
    private String fullnameLengthErr;
    private String confirmIsNotMatched;
    private String usernameExisted;

    public RegistrationCreateErrors() {
    }

    public RegistrationCreateErrors(String usernameLengthErr, String passwordLengthErr, String fullnameLengthErr, String confirmIsNotMatched, String usernameExisted) {
        this.usernameLengthErr = usernameLengthErr;
        this.passwordLengthErr = passwordLengthErr;
        this.fullnameLengthErr = fullnameLengthErr;
        this.confirmIsNotMatched = confirmIsNotMatched;
        this.usernameExisted = usernameExisted;
    }
    
    

    /**
     * @return the usernameLengthErr
     */
    public String getUsernameLengthErr() {
        return usernameLengthErr;
    }

    /**
     * @param usernameLengthErr the usernameLengthErr to set
     */
    public void setUsernameLengthErr(String usernameLengthErr) {
        this.usernameLengthErr = usernameLengthErr;
    }

    /**
     * @return the passwordLengthErr
     */
    public String getPasswordLengthErr() {
        return passwordLengthErr;
    }

    /**
     * @param passwordLengthErr the passwordLengthErr to set
     */
    public void setPasswordLengthErr(String passwordLengthErr) {
        this.passwordLengthErr = passwordLengthErr;
    }

    /**
     * @return the fullnameLengthErr
     */
    public String getFullnameLengthErr() {
        return fullnameLengthErr;
    }

    /**
     * @param fullnameLengthErr the fullnameLengthErr to set
     */
    public void setFullnameLengthErr(String fullnameLengthErr) {
        this.fullnameLengthErr = fullnameLengthErr;
    }

    /**
     * @return the confirmIsNotMatched
     */
    public String getConfirmIsNotMatched() {
        return confirmIsNotMatched;
    }

    /**
     * @param confirmIsNotMatched the confirmIsNotMatched to set
     */
    public void setConfirmIsNotMatched(String confirmIsNotMatched) {
        this.confirmIsNotMatched = confirmIsNotMatched;
    }

    /**
     * @return the usernameExisted
     */
    public String getUsernameExisted() {
        return usernameExisted;
    }

    /**
     * @param usernameExisted the usernameExisted to set
     */
    public void setUsernameExisted(String usernameExisted) {
        this.usernameExisted = usernameExisted;
    }
}
