package com.atuka.customermanagement.jsonplaceholder;

import lombok.Data;

@Data
public class Post {
private final Long id;
private final Long userId;
private final String title;
private final String body;

}
