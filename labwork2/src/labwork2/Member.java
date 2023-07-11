package labwork2;

public class Member implements Membership{
    private String name;
    private int age;
    private MembershipType membershipType;
    private int visits;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public MembershipType getMembershipType() {
        return membershipType;
    }
    public int getVisits() {
        return visits;
    }

    public Member(String name, int age, MembershipType membershipType, int visits) {
        this.name = name;
        this.age= age;
        this.membershipType= membershipType;
        this.visits= visits;
    }

    @Override
    public double calculateMonthlyFee(int age, MembershipType membershipType) {
        if(membershipType==MembershipType.STANDARD) {
            if(age>=60) {
                return 30;
            }
            return 50;
        }
        if(membershipType==MembershipType.PREMIUM) {
            if(age>=60) {
                return 60;
            }
            return 80;
        }
        return 150;
    }

    @Override
    public double calculateDiscountedFee(double baseFee, int visits) {
        if(visits<=4) {
            return baseFee;
        }
        if(visits>=5) {
            if(visits<=9) {
                return (baseFee-((baseFee/100)*5));
            }
            if(visits<=14) {
                return (baseFee-((baseFee/100)*10));
            }
        }
        return (baseFee-((baseFee/100)*15));
    }

    @Override
    public String toString() {
        return "Member{" + "name='" + name  + ", age=" + age + ", membershipType=" + membershipType + ", visits=" + visits + "}" +"\n";
    }
}
