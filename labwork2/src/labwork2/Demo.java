package labwork2;

import java.lang.management.MemoryManagerMXBean;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        System.out.print("\n---------------------------------------------------------------------------------\n");
        ArrayList<Member> members= new ArrayList<>();
        Member m1= new Member("Mehmet", 28, MembershipType.VIP, 3);
        Member m2= new Member("Hakan", 61, MembershipType.VIP, 12);
        Member m3= new Member("Alpay", 30, MembershipType.PREMIUM, 20);
        Member m4= new Member("Deniz", 69, MembershipType.PREMIUM, 8);
        Member m5= new Member("Enes", 20, MembershipType.STANDARD, 16);
        Member m6= new Member("Efe", 71, MembershipType.STANDARD, 11);
        MembershipSystem membershipSystem= new MembershipSystem();
        membershipSystem.addMember(m1);
        membershipSystem.addMember(m2);
        membershipSystem.addMember(m3);
        membershipSystem.addMember(m4);
        membershipSystem.addMember(m5);
        membershipSystem.addMember(m6);

        System.out.println("\nAll members;\n" +membershipSystem.getMembers());
        System.out.println("\nThe total monthly membership revenue of the fitness center=" +membershipSystem.getMonthlyMembershipRevenue());
        System.out.println("\n---------------------------------------------------------------------------------");

        System.out.print("\nMember m5:" +m5.toString());
        System.out.println("The monthly fee of Enes=" +m5.calculateMonthlyFee(m5.getAge(), m5.getMembershipType()) );
        System.out.println("The discounted fee of Enes="
                +m5.calculateDiscountedFee(m5.calculateMonthlyFee(m5.getAge(),m5.getMembershipType()), m5.getVisits() ));
        System.out.println("\n---------------------------------------------------------------------------------");

        membershipSystem.removeMember(m5);
        membershipSystem.removeMember(m4);
        membershipSystem.removeMember(m2);
        System.out.println("\nAll members after the removeMember;\n" + membershipSystem.getMembers());
        System.out.println();
        System.out.println("Monthly fee of all members = "
                +"Mehmet:" +m1.calculateMonthlyFee(m1.getAge(), m1.getMembershipType()) +", "
                +"Alpay:" +m3.calculateMonthlyFee(m3.getAge(), m3.getMembershipType()) +", "
                +"Efe:" +m6.calculateMonthlyFee(m6.getAge(), m6.getMembershipType()));
        System.out.println("Discounted fee of all members = "
                +"Mehmet:" +m1.calculateDiscountedFee(m1.calculateMonthlyFee(m1.getAge(),m1.getMembershipType()), m1.getVisits() ) +", "
                +"Alpay:" +m3.calculateDiscountedFee(m3.calculateMonthlyFee(m3.getAge(),m3.getMembershipType()), m3.getVisits() ) +", "
                +"Efe:" +m6.calculateDiscountedFee(m6.calculateMonthlyFee(m6.getAge(),m6.getMembershipType()), m6.getVisits() ));
        System.out.println("The total monthly membership revenue of the fitness center=" +membershipSystem.getMonthlyMembershipRevenue());
        System.out.println("\n---------------------------------------------------------------------------------");
    }
}
