package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
public class FixDiscountPolicy implements DiscountPolicy{
    private int disCountFixAmount = 1000;

    public int discount(Member member, int price){
        if(member.getGrade() == Grade.VIP){
            return disCountFixAmount;
        }else{
            return 0;
        }
    }
}
