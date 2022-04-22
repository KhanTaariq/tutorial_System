package za.ac.cput.domain;

public class Tutor
{
    private String tutorId;
    private String fName;
    private String lName;
    private String email;
    private String courseTaught;

    private Tutor(Builder builder)
    {
        this.tutorId = builder.tutorId;
        this.fName = builder.fName;
        this.lName =builder.lName;
        this.email = builder.email;
        this.courseTaught = builder.courseTaught;

    }

    public String getTutorId()
    {
        return tutorId;
    }

    public void setTutorIdId(String tutorId)
    {
        this.tutorId = tutorId;
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

    public String getCourseTaught()
    {
        return courseTaught;
    }

    public void setCourseTaught(String courseTaught)
    {
        this.courseTaught = courseTaught;
    }

    @Override
    public String toString()
    {
        return "learner{" +
                "studentId='" + tutorId + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", courseTaken='" + courseTaught + '\'' +
                '}';
    }
    public static class Builder
    {
        private String tutorId;
        private String fName;
        private String lName;
        private String email;
        private String courseTaught;

        public Builder setStudentId(String tutorId)
        {
            this.tutorId = tutorId;
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

        public Builder setCourseTaught(String courseTaught)
        {
            this.courseTaught = courseTaught;
            return this;
        }

        public Builder copy (Tutor tutor)
        {
            this.tutorId = tutor.tutorId;
            this.fName = tutor.fName;
            this.lName =tutor.lName;
            this.email = tutor.email;
            this.courseTaught = tutor.courseTaught;
            return this;
        }
        public Tutor build()
        {
            return new Tutor(this);
        }
    }
}
