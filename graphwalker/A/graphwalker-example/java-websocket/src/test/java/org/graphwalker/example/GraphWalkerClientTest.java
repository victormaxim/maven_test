package org.graphwalker.example;

import java.nio.file.Paths;

public class GraphWalkerClientTest {

    public void smallModel() {

        GraphWalkerWebSocketClient c = new GraphWalkerWebSocketClient();
        c.run();
        c.loadModel(Paths.get("json/SmallModel.json"));
        c.startMachine();
        while (c.hasNext()) {
            c.getNext();
            c.getData();
        }
        c.close();
    }

}