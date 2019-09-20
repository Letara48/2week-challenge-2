public class Resume {
    private String name;
    private String email;
    private String company;
    private String title;
    private String sdate; //start date
    private String edate; //end date
    private String description;

    public Resume(String name, String email, String company, String title, String sdate, String edate, String description) {
        this.name = name;
        this.email = email;
        this.company = company;
        this.title = title;
        this.sdate = sdate;
        this.edate = edate;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public String getEdate() {
        return edate;
    }

    public void setEdate(String edate) {
        this.edate = edate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Resume() {
    }
}
