package org.koreait.member.services;

import lombok.NonNull;
import org.koreait.member.entities.Member;
import org.koreait.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;
@Service
public class InfoService {
    private MemberRepository repository;
    private DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy.MM.dd");
/*@Autowired

    public void setRepository(@Qualifier("mRepo") MemberRepository repository){
        this.repository=repository;
    }*/
    @Autowired
    public void  setRepository(Optional<MemberRepository> opt){
        this.repository=opt.get();
    }
/*    @Autowired(required = false)*/
    @Autowired
    public void setFormatter(@Nullable DateTimeFormatter formatter){
    this.formatter=formatter;
    }

    public void print(){
        List<Member> members=repository.getList();
       members.forEach(m->{
       if (formatter !=null){
           String regDtStr=formatter.format(m.getRegDt());
           m.setRegDtStr(regDtStr);
       }
           System.out.println(m);
       });
    }
}
