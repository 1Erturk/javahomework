package labwork2;

import java.util.ArrayList;

public class MembershipSystem {
    ArrayList<Member> members= new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
    }
    public void removeMember(Member member) {
        members.remove(member);
    }

    public ArrayList<Member> getMembers() {
        return members;
    }
    public double getMonthlyMembershipRevenue() {
        int total= 0;
        for (int i = 0; i < members.size(); i++) {
            double baseFee= members.get(i).calculateMonthlyFee(members.get(i).getAge(), members.get(i).getMembershipType());
            total+= members.get(i).calculateDiscountedFee(baseFee, members.get(i).getVisits() );
        }
        return total;
    }
}
