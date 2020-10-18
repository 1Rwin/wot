package com.filrob.wot.domain.cards.test;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@DiscriminatorValue("test1")
@Data
@ToString
public class Test1 extends TestMasta {

    private Integer bla;

}
