public class Main_Pr2 {
    public static void main(String[] args) {
        GoogleEmployee joe = new GoogleEmployee("Joe", "Google");
        GoogleEmployee jane = new GoogleEmployee("Jane", "Google");
        MicrosoftEmployee jesse = new MicrosoftEmployee("Jesse", "Microsoft");
        MicrosoftEmployee joy = new MicrosoftEmployee("Joy", "Microsoft");
        AdobeEmployee bill = new AdobeEmployee("Bill", "Adobe");
        AdobeEmployee bill2 = new AdobeEmployee("Bill", "Adobe");

        Company<GoogleEmployee> google = new Company<>("Google");
        google.addEmployee(joe);
        google.addEmployee(jane);

        System.out.println("Google employee list:");
        System.out.println(google);

        Company<MicrosoftEmployee> microsoft = new Company<>("Microsoft");
        microsoft.addEmployee(jesse);
        microsoft.addEmployee(joy);


        Company<AdobeEmployee> adobe = new Company<>("Adobe");
        adobe.addEmployee(bill);
        adobe.addEmployee(bill2);

        System.out.println("Adobe employee list:");
        System.out.println(adobe);
    }
}
