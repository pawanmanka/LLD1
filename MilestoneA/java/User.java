class  User {
    private String userId;
    private String name;
    private String contactInfo;
    /* Getters for private member */
    public String getName(){
        return name;
    }
    public String getContactInfo(){
        return contactInfo;
    }
    /* Setter for private member */
    public void setName(String name){
        this.name = name;
    }
    public void setContactInfo(String contactInfo){
        this.contactInfo = contactInfo;
    }
    public  User(){

    }

}