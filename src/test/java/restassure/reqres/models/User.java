package restassure.reqres.models;

public class User {

    private long id;
    private String email;
    private String first_name;
    private String last_name;
    private String job;

    // use for POST request
    public User(String email, String first_name, String last_name, String job) {
        setEmail(email);
        setFirst_name(first_name);
        setLast_name(last_name);
        setJob(job);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}