package uk.ac.wlv.criminalintent;


import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mID;
    private String mTitle;
    private Date mDate;

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    private boolean mSolved;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public Crime() {

        this(UUID.randomUUID());
    }

    public Crime(UUID id) {

        mID = id;
        mDate = new Date();
    }

    public UUID getID() {
        return mID;
    }

    public void setID(UUID ID) {
        mID = ID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
