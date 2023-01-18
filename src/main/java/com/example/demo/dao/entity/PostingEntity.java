package com.example.demo.dao.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "posting")
public class PostingEntity {
	
	@Id
	@Column(name = "idx")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idx;
	
	@Column(name = "board_type")
	private String boardType;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "cont")
	private String cont;
	
	@Column(name = "crt_user_id")
	private String crtUserId;
	
	@Column(name = "crt_dt")
	private LocalDateTime crtDti;
	
	@Column(name = "views")
	private int views;


}
