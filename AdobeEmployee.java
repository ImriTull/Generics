public class AdobeEmployee extends Employee
{
    public AdobeEmployee(String name, String companyName)
    {
        super(name, companyName);
    }

    public String toString()
    {
        return "Adobe employee " + this.getName();
    }
}
