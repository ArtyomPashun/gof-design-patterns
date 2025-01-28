package com.pashuna.patterns.creational.builder;

public class BuilderRunner {
    public static void main(String[] args) {
        Post post = new Post.Builder()
                .title("Welcome letter")
                .text("Hello form the other side...")
                .category("private")
                .build();
    }
}
