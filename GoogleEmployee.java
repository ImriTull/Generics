public class GoogleEmployee extends Employee
{
    public GoogleEmployee(String name, String companyName)
    {
        super(name, companyName);
    }

    public String toString()
    {
        return "Google employee " + this.getName();
    }
}
