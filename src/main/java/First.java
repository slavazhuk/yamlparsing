public class First {
    public static void main(String args[]) throws Exception {
        YamlFile.printYamlFileContent();

        YamlNode.printNode("a1");
        YamlNode.printNode("c1");
        YamlNode.printNode("c1.c22");
        YamlNode.printNode("c1.c23");
        YamlNode.printNode("c1.c23.c232");
        YamlNode.printNode("d1");

        YamlNode.printNode("qwe");
    }
}