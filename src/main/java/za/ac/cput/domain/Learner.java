package za.ac.cput.domain;
/* Learner.java
 Author: Taariq Khan (219231141)
 Date: 18 April 2022*/
public class Learner
{
    private String studentId;
    private String fName;
    private String lName;
    private String email;
    private String courseTaken;

    private Learner(Builder builder)
    {
    this.studentId = builder.studentId;
    this.fName = builder.fName;
    this.lName =builder.lName;
    this.email = builder.email;
    this.courseTaken = builder.courseTaken;

    }

    public String getStudentId()
    {
        return studentId;
    }

    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    public String getfName()
    {
        return fName;
    }

    public void setfName(String fName)
    {
        this.fName = fName;
    }

    public String getlName()
    {
        return lName;
    }

    public void setlName(String lName)
    {
        this.lName = lName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getCourseTaken()
    {
        return courseTaken;
    }

    public void setCourseTaken(String courseTaken)
    {
        this.courseTaken = courseTaken;
    }

    @Override
    public String toString()
    {
        return "learner{" +
                "studentId='" + studentId + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", courseTaken='" + courseTaken + '\'' +
                '}';
    }
    public static class Builder
    {
        private String studentId;
        private String fName;
        private String lName;
        private String email;
        private String courseTaken;

        public Builder setStudentId(String studentId)
        {
            this.studentId = studentId;
            return this;
        }

        public Builder setfName(String fName)
        {
            this.fName = fName;
            return this;
        }

        public Builder setlName(String lName)
        {
            this.lName = lName;
            return this;
        }

        public Builder setEmail(String email)
        {
            this.email = email;
            return this;
        }

        public Builder setCourseTaken(String courseTaken)
        {
            this.courseTaken = courseTaken;
            return this;
        }

        public Builder copy (Learner learner)
        {
            this.studentId = learner.studentId;
            this.fName = learner.fName;
            this.lName =learner.lName;
            this.email = learner.email;
            this.courseTaken = learner.courseTaken;
            return this;
        }
        public Learner build()
        {
            return new Learner(this);
        }
    }
}
