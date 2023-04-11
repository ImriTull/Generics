public class MicrosoftEmployee extends Employee
{
    public MicrosoftEmployee(String name, String companyName)
    {
        super(name, companyName);
    }

    public String toString()
    {
        return "Microsoft employee " + this.getName();
    }
}
