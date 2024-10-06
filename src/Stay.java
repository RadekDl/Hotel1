public class Stay {             //pobyt

    private boolean isWorkStay;// pracovní pobyt

    public boolean getIsWorkStay() {
        return isWorkStay;
    }

    public void setIsWorkStay(boolean isWorkStay) {
        this.isWorkStay = isWorkStay;
    }


    //konstruktor

    public Stay(boolean isWorkStay){
        this.isWorkStay = isWorkStay;
    }


}
