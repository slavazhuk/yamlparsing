import java.util.Map;

public class YamlNode {
    public static Object getNode(String node) throws Exception {
        // get content of all document
        Map<String, Object> yamlFileContent = YamlFile.getYamlFileContent();

        // split by delimiter
        String[] result = node.split("\\.");
        Object previousNode = null;
        Object currentNode = null;

        for(int i = 0; i < result.length; i++) {
            if (i == 0) {
                currentNode = yamlFileContent.get(result[i]);
                previousNode = currentNode;
            }

            if (i > 0) {
                currentNode = ((Map<String, Object>) previousNode).get(result[i]);
                previousNode = currentNode;
            }
        }

        if (currentNode == null) {
            throw new RuntimeException("unable to find node with name " + node + " in yaml file");
        }

        return currentNode;
    }

    public static void printNode(String note) throws Exception {
        Object node = getNode(note);

        System.out.println(node);
    }
}