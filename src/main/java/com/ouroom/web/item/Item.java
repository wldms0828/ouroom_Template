package com.ouroom.web.item;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Lazy
public class Item {
	String seq,title,price,delivery,discount,photo,sale_cnt,stroe_cnt,category2_seq,category;

}