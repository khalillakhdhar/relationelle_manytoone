package com.example.spboot.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.sun.istack.NotNull;


@Entity
public class Comment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
@NotNull
String texte;

@ManyToOne(fetch = FetchType.LAZY, optional = false)
@JoinColumn(name = "post_id", nullable = false)
@OnDelete(action = OnDeleteAction.CASCADE)
private Post post;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getTexte() {
	return texte;
}

public void setTexte(String texte) {
	this.texte = texte;
}

public Post getPost() {
	return post;
}

public void setPost(Post post) {
	this.post = post;
}


}
