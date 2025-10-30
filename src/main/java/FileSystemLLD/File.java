package FileSystemLLD;

public class File extends FileSystemNode{
    private String content;
    private final String extension;

    File(String name) {
        super(name);
        this.extension = getExtension(name);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String getExtension(String name) {
        String[] comps = name.split("\\.");
        return comps[comps.length-1];
    }

    @Override
    public boolean isFile() {
        return true;
    }

    @Override
    public void display(int depth) {
        String indent = " ".repeat(depth*2);
        System.out.println(indent + getName());
    }
}
