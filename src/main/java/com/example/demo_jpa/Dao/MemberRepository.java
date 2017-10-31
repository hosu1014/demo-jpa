package com.example.demo_jpa.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo_jpa.Entity.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

}
