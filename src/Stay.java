public class Stay {             //pobyt

    private boolean workStay;// pracovní pobyt

    public boolean isWorkStay() {
        return workStay;
    }

    public void setWorkStay(boolean workStay) {
        this.workStay = workStay;
    }


    //konstruktor

    public Stay(boolean workStay){
        this.workStay = workStay;
    }


}
