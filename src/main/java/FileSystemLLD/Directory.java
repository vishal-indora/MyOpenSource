package FileSystemLLD;

import java.util.Map;

public class Directory extends FileSystemNode{


    Directory(String name) {
        super(name);
    }

    @Override
    public boolean isFile() {
        return false;
    }

    @Override
    public void display(int depth) {
        String indent = " ".repeat(depth*2);
        System.out.println(indent + getName() + "(" + getChildren().size() + ") items");
        Map<String, FileSystemNode> children = getChildren();
        for (Map.Entry<String , FileSystemNode> entry: children.entrySet()) {
            entry.getValue().display(depth+1);
        }
    }
}
