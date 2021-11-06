package ca.durhamcollege;

public class Person
{
    private int m_age;
    private String m_name;

    // Constructors
    Person(String name, int age)
    {
        Set(name, age);
    }

    // Getters and Setters

    public int getAge()
    {
        return m_age;
    }

    public void setAge(int age)
    {
        m_age = age;
    }

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public void Set(String name, int age)
    {
        setName(name);
        setAge(age);
    }

    public Person(int m_age, String m_name) {
        this.m_age = m_age;
        this.m_name = m_name;
    }

    public Person(int age) {
        this.m_age = age;

    }
    public Person(String name) {
        this.m_name = name;
    }

    public Person()
    {
        m_name = "unknown";
        m_age = 0;
    }
    // public methods

    /* Tests Person class and returns simple console message  */
    public void SaysHello()
    {
        System.out.println(getName() + " says hello!");
    }
    /*  overrides built in toString method and returns Person properties*/
    public String toString()
    {
        String outputString = "";
        outputString += "Name: " + this.m_name + " ";
        outputString += "Age: " + this.m_age;
        return outputString;
    }


}
