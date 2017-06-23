package org.kshrd.spring.model;

/**
 * Created by Obi-Voin Kenobi on 22-Jun-17.
 */
public class User {

    private int mId;
    private String mUsername, mGender, mEmail, mPhoneNumber, mHashCode, mStatus;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getmGender() {
        return mGender;
    }

    public void setmGender(String mGender) {
        this.mGender = mGender;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public void setmPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }

    public String getmHashCode() {
        return mHashCode;
    }

    public void setmHashCode(String mHashCode) {
        this.mHashCode = mHashCode;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }
}
