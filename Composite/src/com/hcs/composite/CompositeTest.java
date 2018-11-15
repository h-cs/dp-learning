package com.hcs.composite;


/**
 * @description:
 * @author: hcs
 * @date: 2018/11/15 23:31
 */
public class CompositeTest {

    public static void createTree(Node node) throws Exception {
        java.io.File jFile = new java.io.File(node.name);
        java.io.File[] jFiles = jFile.listFiles();
        for (java.io.File jF : jFiles) {
            if (jF.isFile()) {
                File file = new File(jF.getAbsolutePath());
                node.addNode(file);
            }
            if (jF.isDirectory()) {
                Node directory = new Directory(jF.getAbsolutePath());
                node.addNode(directory);
                createTree(directory);
            }
        }
    }

    public static void main(String[] args) {
        Node directory = new Directory("/Users/hcs/books");

        try {
            createTree(directory);
        } catch (Exception e) {
            e.printStackTrace();
        }

        directory.display();
    }
}
