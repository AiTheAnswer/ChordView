package com.allen.chordview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.allen.chordview.entity.ChordEntity;
import com.allen.chordview.entity.ChordGroup;
import com.allen.chordview.entity.ChordModel;
import com.allen.chordview.entity.Floor;
import com.allen.chordview.entity.Node;
import com.allen.chordview.view.ChordLayout;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ChordLayout chordView;
    private List<ChordGroup> mChordGroups;
    private ChordModel chordModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initChordGroup();
        initChordModel();
        chordView.setData(mChordGroups);
    }

    private void initChordModel() {
        Gson gson = new Gson();
        chordModel = gson.fromJson(data,ChordModel.class);
        initFloors();
        initNodes();

    }

    private void initNodes() {
        List<Node> nodes = new ArrayList<>();
        nodes.add(new Node("Hn_P00012S00448","真熙家",1,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00422","贡茶",3,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00446","每每涮",2,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00420","烤匠",11,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00287","言几又",2,null,"3F",null,null,null));
        nodes.add(new Node("Hn_P00012S00424","C+",2,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00144","周大福",1,null,"1F",null,null,null));
        nodes.add(new Node("Hn_P00012S00404","韩悦",5,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00260","森林鸟",1,null,"2F",null,null,null));
        nodes.add(new Node("Hn_P00012S00325","番茄田",3,null,"3F",null,null,null));
        nodes.add(new Node("Hn_P00012S00285","贝尔机器人",4,null,"3F",null,null,null));
        nodes.add(new Node("Hn_P00012S00402","雅粤",2,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00262","SHCER",1,null,"2F",null,null,null));
        nodes.add(new Node("Hn_P00012S00226","BURGER KING",6,null,"2F",null,null,null));
        nodes.add(new Node("Hn_P00012S00190","屈臣氏",1,null,"2F",null,null,null));
        nodes.add(new Node("Hn_P00012S00321","木槿生活",4,null,"3F",null,null,null));
        nodes.add(new Node("Hn_P00012S00506","山城外",2,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00228","百变创造力乐高儿童创意中心",1,null,"2F",null,null,null));
        nodes.add(new Node("Hn_P00012S00192","都会美家",3,null,"2F",null,null,null));
        nodes.add(new Node("Hn_P00012S00514","弥茶",1,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00513","一只酸奶牛",2,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00194","鹿岛",2,null,"2F",null,null,null));
        nodes.add(new Node("Hn_P00012S00319","hayiya",1,null,"3F",null,null,null));
        nodes.add(new Node("Hn_P00012S00317","荣泰",1,null,"3F",null,null,null));
        nodes.add(new Node("Hn_P00012S00418","吉布鲁",3,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00386","吉维亚",3,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00416","大通冰室",4,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00388","德香苑",1,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00438","熙客小吃",2,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00230","麦当劳",4,null,"2F",null,null,null));
        nodes.add(new Node("Hn_P00012S00410","黄记煌",1,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00436","DQ",1,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00279","金色雨林",2,null,"3F",null,null,null));
        nodes.add(new Node("Hn_P00012S00430","徐亮胖哥烤蹄",1,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00272","安杰安尼",1,null,"2F",null,null,null));
        nodes.add(new Node("Hn_P00012S00518","花里",2,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00232","ABC KID",1,null,"2F",null,null,null));
        nodes.add(new Node("Hn_P00012S00516","UBTECH",2,null,"3F",null,null,null));
        nodes.add(new Node("Hn_P00012S00499","OGAWA",1,null,"3F",null,null,null));
        nodes.add(new Node("Hn_P00012S00186","KFC",1,null,"2F",null,null,null));
        nodes.add(new Node("Hn_P00012S00497","煲仔煌",1,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00450","和来",1,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00520","爱辣啵啵鱼",1,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00390","卤元素",1,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00371","索菲亚全屋定制",1,null,"3F",null,null,null));
        nodes.add(new Node("Hn_P00012S00378","芭莉与彩虹",1,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00376","恬记耗儿鱼",1,null,"4F",null,null,null));
        nodes.add(new Node("Hn_P00012S00452","VQ",1,null,"4F",null,null,null));
        chordModel.setNodes(nodes);
    }

    private void initFloors() {
        List<Floor> floors = new ArrayList<>();
        floors.add(new Floor("1F"));
        floors.add(new Floor("2F"));
        floors.add(new Floor("3F"));
        floors.add(new Floor("4F"));
        chordModel.setFloors(floors);
    }

    private void initView() {
        chordView = findViewById(R.id.chord_view);
    }

    private void initChordGroup() {
        mChordGroups = new ArrayList<>();
        List<ChordEntity> group1Entity = new ArrayList<>();
        group1Entity.add(new ChordEntity("默特萨克", 1));
        group1Entity.add(new ChordEntity("波多尔斯基", 1));
        group1Entity.add(new ChordEntity("厄齐尔", 1));
        ChordGroup chordGroup1 = new ChordGroup(group1Entity, "阿森纳", 3);

        mChordGroups.add(chordGroup1);
        List<ChordEntity> group2Entity = new ArrayList<>();
        group2Entity.add(new ChordEntity("胡梅尔斯", 1));
        group2Entity.add(new ChordEntity("魏登费勒", 1));
        group2Entity.add(new ChordEntity("杜尔姆", 1));
        group2Entity.add(new ChordEntity("格罗斯克罗伊茨", 1));
        ChordGroup chordGroup2 = new ChordGroup(group2Entity, "多特蒙德", 4);

        mChordGroups.add(chordGroup2);
        List<ChordEntity> group3Entity = new ArrayList<>();
        group3Entity.add(new ChordEntity("诺伊尔", 1));
        group3Entity.add(new ChordEntity("博阿滕", 1));
        group3Entity.add(new ChordEntity("施魏因施泰格", 1));
        group3Entity.add(new ChordEntity("拉姆", 1));
        group3Entity.add(new ChordEntity("克罗斯", 1));
        group3Entity.add(new ChordEntity("穆勒", 1));
        group3Entity.add(new ChordEntity("格策", 1));
        ChordGroup chordGroup3 = new ChordGroup(group3Entity, "拜仁慕尼黑", 7);

        mChordGroups.add(chordGroup3);
    }
    private String data = "{\n" +
            "    \"floors\": [\n" +
            "        {\n" +
            "            \"name\": \"4F\"\n" +
            "        }, \n" +
            "        {\n" +
            "            \"name\": \"3F\"\n" +
            "        }, \n" +
            "        {\n" +
            "            \"name\": \"2F\"\n" +
            "        }, \n" +
            "        {\n" +
            "            \"name\": \"1F\"\n" +
            "        }\n" +
            "    ], \n" +
            "    \"nodes\": [\n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00448\", \n" +
            "            \"name\": \"真熙家\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00422\", \n" +
            "            \"name\": \"贡茶\", \n" +
            "            \"symbolSize\": 3, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00446\", \n" +
            "            \"name\": \"每每涮\", \n" +
            "            \"symbolSize\": 2, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00420\", \n" +
            "            \"name\": \"烤匠\", \n" +
            "            \"symbolSize\": 11, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00287\", \n" +
            "            \"name\": \"言几又\", \n" +
            "            \"symbolSize\": 2, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"3F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00424\", \n" +
            "            \"name\": \"C+\", \n" +
            "            \"symbolSize\": 2, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00144\", \n" +
            "            \"name\": \"周大福\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"1F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00404\", \n" +
            "            \"name\": \"韩悦\", \n" +
            "            \"symbolSize\": 5, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00260\", \n" +
            "            \"name\": \"森林鸟\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"2F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00325\", \n" +
            "            \"name\": \"番茄田\", \n" +
            "            \"symbolSize\": 3, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"3F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00285\", \n" +
            "            \"name\": \"贝尔机器人\", \n" +
            "            \"symbolSize\": 4, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"3F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00402\", \n" +
            "            \"name\": \"雅粤\", \n" +
            "            \"symbolSize\": 2, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00262\", \n" +
            "            \"name\": \"SHCER\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"2F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00226\", \n" +
            "            \"name\": \"BURGER KING\", \n" +
            "            \"symbolSize\": 6, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"2F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00190\", \n" +
            "            \"name\": \"屈臣氏\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"2F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00321\", \n" +
            "            \"name\": \"木槿生活\", \n" +
            "            \"symbolSize\": 4, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"3F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00506\", \n" +
            "            \"name\": \"山城外\", \n" +
            "            \"symbolSize\": 2, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00228\", \n" +
            "            \"name\": \"百变创造力乐高儿童创意中心\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"2F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00192\", \n" +
            "            \"name\": \"都会美家\", \n" +
            "            \"symbolSize\": 3, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"2F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00514\", \n" +
            "            \"name\": \"弥茶\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00513\", \n" +
            "            \"name\": \"一只酸奶牛\", \n" +
            "            \"symbolSize\": 2, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00194\", \n" +
            "            \"name\": \"鹿岛\", \n" +
            "            \"symbolSize\": 2, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"2F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00319\", \n" +
            "            \"name\": \"hayiya\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"3F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00317\", \n" +
            "            \"name\": \"荣泰\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"3F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00418\", \n" +
            "            \"name\": \"吉布鲁\", \n" +
            "            \"symbolSize\": 3, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00386\", \n" +
            "            \"name\": \"吉维亚\", \n" +
            "            \"symbolSize\": 3, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00416\", \n" +
            "            \"name\": \"大通冰室\", \n" +
            "            \"symbolSize\": 4, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00388\", \n" +
            "            \"name\": \"德香苑\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00438\", \n" +
            "            \"name\": \"熙客小吃\", \n" +
            "            \"symbolSize\": 2, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00230\", \n" +
            "            \"name\": \"麦当劳\", \n" +
            "            \"symbolSize\": 4, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"2F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00410\", \n" +
            "            \"name\": \"黄记煌\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00436\", \n" +
            "            \"name\": \"DQ\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00279\", \n" +
            "            \"name\": \"金色雨林\", \n" +
            "            \"symbolSize\": 2, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"3F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00430\", \n" +
            "            \"name\": \"徐亮胖哥烤蹄\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00272\", \n" +
            "            \"name\": \"安杰安尼\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"2F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00518\", \n" +
            "            \"name\": \"花里\", \n" +
            "            \"symbolSize\": 2, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00232\", \n" +
            "            \"name\": \"ABC KIDS\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"2F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00516\", \n" +
            "            \"name\": \"UBTECH\", \n" +
            "            \"symbolSize\": 2, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"3F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00499\", \n" +
            "            \"name\": \"OGAWA\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"3F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00186\", \n" +
            "            \"name\": \"KFC\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"2F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00497\", \n" +
            "            \"name\": \"煲仔煌\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00450\", \n" +
            "            \"name\": \"和来\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00520\", \n" +
            "            \"name\": \"爱辣啵啵鱼\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00390\", \n" +
            "            \"name\": \"卤元素\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00371\", \n" +
            "            \"name\": \"索菲亚全屋定制\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"3F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00378\", \n" +
            "            \"name\": \"芭莉与彩虹\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00376\", \n" +
            "            \"name\": \"恬记耗儿鱼\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": \"Hn_P00012S00452\", \n" +
            "            \"name\": \"VQ\", \n" +
            "            \"symbolSize\": 1, \n" +
            "            \"source\": null, \n" +
            "            \"category\": \"4F\", \n" +
            "            \"target\": null, \n" +
            "            \"value\": null, \n" +
            "            \"lineStyle\": null\n" +
            "        }\n" +
            "    ], \n" +
            "    \"labels\": [\n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00287\", \n" +
            "            \"sourceShopName\": \"言几又\", \n" +
            "            \"sourceShopFloorName\": \"3F\", \n" +
            "            \"sourceShopFloorNum\": 3, \n" +
            "            \"targetShopId\": \"Hn_P00012S00285\", \n" +
            "            \"targetShopName\": \"贝尔机器人\", \n" +
            "            \"targetShopFloorName\": \"3F\", \n" +
            "            \"targetShopFloorNum\": 3, \n" +
            "            \"correlationDegree\": 0.9999\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00416\", \n" +
            "            \"sourceShopName\": \"大通冰室\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00420\", \n" +
            "            \"targetShopName\": \"烤匠\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.9458\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00422\", \n" +
            "            \"sourceShopName\": \"贡茶\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00420\", \n" +
            "            \"targetShopName\": \"烤匠\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.918\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00418\", \n" +
            "            \"sourceShopName\": \"吉布鲁\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00420\", \n" +
            "            \"targetShopName\": \"烤匠\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.8951\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00272\", \n" +
            "            \"sourceShopName\": \"安杰安尼\", \n" +
            "            \"sourceShopFloorName\": \"2F\", \n" +
            "            \"sourceShopFloorNum\": 2, \n" +
            "            \"targetShopId\": \"Hn_P00012S00186\", \n" +
            "            \"targetShopName\": \"KFC\", \n" +
            "            \"targetShopFloorName\": \"2F\", \n" +
            "            \"targetShopFloorNum\": 2, \n" +
            "            \"correlationDegree\": 0.7089\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00194\", \n" +
            "            \"sourceShopName\": \"鹿岛\", \n" +
            "            \"sourceShopFloorName\": \"2F\", \n" +
            "            \"sourceShopFloorNum\": 2, \n" +
            "            \"targetShopId\": \"Hn_P00012S00192\", \n" +
            "            \"targetShopName\": \"都会美家\", \n" +
            "            \"targetShopFloorName\": \"2F\", \n" +
            "            \"targetShopFloorNum\": 2, \n" +
            "            \"correlationDegree\": 0.6154\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00230\", \n" +
            "            \"sourceShopName\": \"麦当劳\", \n" +
            "            \"sourceShopFloorName\": \"2F\", \n" +
            "            \"sourceShopFloorNum\": 2, \n" +
            "            \"targetShopId\": \"Hn_P00012S00226\", \n" +
            "            \"targetShopName\": \"BURGER KING\", \n" +
            "            \"targetShopFloorName\": \"2F\", \n" +
            "            \"targetShopFloorNum\": 2, \n" +
            "            \"correlationDegree\": 0.601\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00378\", \n" +
            "            \"sourceShopName\": \"芭莉与彩虹\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00376\", \n" +
            "            \"targetShopName\": \"恬记耗儿鱼\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.5359\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00321\", \n" +
            "            \"sourceShopName\": \"木槿生活\", \n" +
            "            \"sourceShopFloorName\": \"3F\", \n" +
            "            \"sourceShopFloorNum\": 3, \n" +
            "            \"targetShopId\": \"Hn_P00012S00420\", \n" +
            "            \"targetShopName\": \"烤匠\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.519\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00452\", \n" +
            "            \"sourceShopName\": \"VQ\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00386\", \n" +
            "            \"targetShopName\": \"吉维亚\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.5148\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00516\", \n" +
            "            \"sourceShopName\": \"UBTECH\", \n" +
            "            \"sourceShopFloorName\": \"3F\", \n" +
            "            \"sourceShopFloorNum\": 3, \n" +
            "            \"targetShopId\": \"Hn_P00012S00285\", \n" +
            "            \"targetShopName\": \"贝尔机器人\", \n" +
            "            \"targetShopFloorName\": \"3F\", \n" +
            "            \"targetShopFloorNum\": 3, \n" +
            "            \"correlationDegree\": 0.5033\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00506\", \n" +
            "            \"sourceShopName\": \"山城外\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00404\", \n" +
            "            \"targetShopName\": \"韩悦\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.4937\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00424\", \n" +
            "            \"sourceShopName\": \"C+\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00420\", \n" +
            "            \"targetShopName\": \"烤匠\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.484\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00516\", \n" +
            "            \"sourceShopName\": \"UBTECH\", \n" +
            "            \"sourceShopFloorName\": \"3F\", \n" +
            "            \"sourceShopFloorNum\": 3, \n" +
            "            \"targetShopId\": \"Hn_P00012S00287\", \n" +
            "            \"targetShopName\": \"言几又\", \n" +
            "            \"targetShopFloorName\": \"3F\", \n" +
            "            \"targetShopFloorNum\": 3, \n" +
            "            \"correlationDegree\": 0.4822\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00319\", \n" +
            "            \"sourceShopName\": \"hayiya\", \n" +
            "            \"sourceShopFloorName\": \"3F\", \n" +
            "            \"sourceShopFloorNum\": 3, \n" +
            "            \"targetShopId\": \"Hn_P00012S00420\", \n" +
            "            \"targetShopName\": \"烤匠\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.4792\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00422\", \n" +
            "            \"sourceShopName\": \"贡茶\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00416\", \n" +
            "            \"targetShopName\": \"大通冰室\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.4575\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00450\", \n" +
            "            \"sourceShopName\": \"和来\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00386\", \n" +
            "            \"targetShopName\": \"吉维亚\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.4503\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00402\", \n" +
            "            \"sourceShopName\": \"雅粤\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00404\", \n" +
            "            \"targetShopName\": \"韩悦\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.4473\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00325\", \n" +
            "            \"sourceShopName\": \"番茄田\", \n" +
            "            \"sourceShopFloorName\": \"3F\", \n" +
            "            \"sourceShopFloorNum\": 3, \n" +
            "            \"targetShopId\": \"Hn_P00012S00420\", \n" +
            "            \"targetShopName\": \"烤匠\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.4364\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00388\", \n" +
            "            \"sourceShopName\": \"德香苑\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00446\", \n" +
            "            \"targetShopName\": \"每每涮\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.4135\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00418\", \n" +
            "            \"sourceShopName\": \"吉布鲁\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00416\", \n" +
            "            \"targetShopName\": \"大通冰室\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.4099\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00438\", \n" +
            "            \"sourceShopName\": \"熙客小吃\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00404\", \n" +
            "            \"targetShopName\": \"韩悦\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.4081\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00497\", \n" +
            "            \"sourceShopName\": \"煲仔煌\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00420\", \n" +
            "            \"targetShopName\": \"烤匠\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.3954\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00402\", \n" +
            "            \"sourceShopName\": \"雅粤\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00438\", \n" +
            "            \"targetShopName\": \"熙客小吃\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.3888\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00279\", \n" +
            "            \"sourceShopName\": \"金色雨林\", \n" +
            "            \"sourceShopFloorName\": \"3F\", \n" +
            "            \"sourceShopFloorNum\": 3, \n" +
            "            \"targetShopId\": \"Hn_P00012S00285\", \n" +
            "            \"targetShopName\": \"贝尔机器人\", \n" +
            "            \"targetShopFloorName\": \"3F\", \n" +
            "            \"targetShopFloorNum\": 3, \n" +
            "            \"correlationDegree\": 0.3797\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00260\", \n" +
            "            \"sourceShopName\": \"森林鸟\", \n" +
            "            \"sourceShopFloorName\": \"2F\", \n" +
            "            \"sourceShopFloorNum\": 2, \n" +
            "            \"targetShopId\": \"Hn_P00012S00194\", \n" +
            "            \"targetShopName\": \"鹿岛\", \n" +
            "            \"targetShopFloorName\": \"2F\", \n" +
            "            \"targetShopFloorNum\": 2, \n" +
            "            \"correlationDegree\": 0.3623\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00436\", \n" +
            "            \"sourceShopName\": \"DQ\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00404\", \n" +
            "            \"targetShopName\": \"韩悦\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.3617\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00390\", \n" +
            "            \"sourceShopName\": \"卤元素\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00446\", \n" +
            "            \"targetShopName\": \"每每涮\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.3562\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00190\", \n" +
            "            \"sourceShopName\": \"屈臣氏\", \n" +
            "            \"sourceShopFloorName\": \"2F\", \n" +
            "            \"sourceShopFloorNum\": 2, \n" +
            "            \"targetShopId\": \"Hn_P00012S00192\", \n" +
            "            \"targetShopName\": \"都会美家\", \n" +
            "            \"targetShopFloorName\": \"2F\", \n" +
            "            \"targetShopFloorNum\": 2, \n" +
            "            \"correlationDegree\": 0.3538\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00371\", \n" +
            "            \"sourceShopName\": \"索菲亚全屋定制\", \n" +
            "            \"sourceShopFloorName\": \"3F\", \n" +
            "            \"sourceShopFloorNum\": 3, \n" +
            "            \"targetShopId\": \"Hn_P00012S00279\", \n" +
            "            \"targetShopName\": \"金色雨林\", \n" +
            "            \"targetShopFloorName\": \"3F\", \n" +
            "            \"targetShopFloorNum\": 3, \n" +
            "            \"correlationDegree\": 0.3538\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00325\", \n" +
            "            \"sourceShopName\": \"番茄田\", \n" +
            "            \"sourceShopFloorName\": \"3F\", \n" +
            "            \"sourceShopFloorNum\": 3, \n" +
            "            \"targetShopId\": \"Hn_P00012S00226\", \n" +
            "            \"targetShopName\": \"BURGER KING\", \n" +
            "            \"targetShopFloorName\": \"2F\", \n" +
            "            \"targetShopFloorNum\": 2, \n" +
            "            \"correlationDegree\": 0.3526\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00518\", \n" +
            "            \"sourceShopName\": \"花里\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00506\", \n" +
            "            \"targetShopName\": \"山城外\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.349\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00325\", \n" +
            "            \"sourceShopName\": \"番茄田\", \n" +
            "            \"sourceShopFloorName\": \"3F\", \n" +
            "            \"sourceShopFloorNum\": 3, \n" +
            "            \"targetShopId\": \"Hn_P00012S00321\", \n" +
            "            \"targetShopName\": \"木槿生活\", \n" +
            "            \"targetShopFloorName\": \"3F\", \n" +
            "            \"targetShopFloorNum\": 3, \n" +
            "            \"correlationDegree\": 0.3454\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00321\", \n" +
            "            \"sourceShopName\": \"木槿生活\", \n" +
            "            \"sourceShopFloorName\": \"3F\", \n" +
            "            \"sourceShopFloorNum\": 3, \n" +
            "            \"targetShopId\": \"Hn_P00012S00226\", \n" +
            "            \"targetShopName\": \"BURGER KING\", \n" +
            "            \"targetShopFloorName\": \"2F\", \n" +
            "            \"targetShopFloorNum\": 2, \n" +
            "            \"correlationDegree\": 0.3418\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00518\", \n" +
            "            \"sourceShopName\": \"花里\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00404\", \n" +
            "            \"targetShopName\": \"韩悦\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.34\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00144\", \n" +
            "            \"sourceShopName\": \"周大福\", \n" +
            "            \"sourceShopFloorName\": \"1F\", \n" +
            "            \"sourceShopFloorNum\": 1, \n" +
            "            \"targetShopId\": \"Hn_P00012S00226\", \n" +
            "            \"targetShopName\": \"BURGER KING\", \n" +
            "            \"targetShopFloorName\": \"2F\", \n" +
            "            \"targetShopFloorNum\": 2, \n" +
            "            \"correlationDegree\": 0.3394\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00232\", \n" +
            "            \"sourceShopName\": \"ABC KIDS\", \n" +
            "            \"sourceShopFloorName\": \"2F\", \n" +
            "            \"sourceShopFloorNum\": 2, \n" +
            "            \"targetShopId\": \"Hn_P00012S00226\", \n" +
            "            \"targetShopName\": \"BURGER KING\", \n" +
            "            \"targetShopFloorName\": \"2F\", \n" +
            "            \"targetShopFloorNum\": 2, \n" +
            "            \"correlationDegree\": 0.3388\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00321\", \n" +
            "            \"sourceShopName\": \"木槿生活\", \n" +
            "            \"sourceShopFloorName\": \"3F\", \n" +
            "            \"sourceShopFloorNum\": 3, \n" +
            "            \"targetShopId\": \"Hn_P00012S00230\", \n" +
            "            \"targetShopName\": \"麦当劳\", \n" +
            "            \"targetShopFloorName\": \"2F\", \n" +
            "            \"targetShopFloorNum\": 2, \n" +
            "            \"correlationDegree\": 0.3376\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00226\", \n" +
            "            \"sourceShopName\": \"BURGER KING\", \n" +
            "            \"sourceShopFloorName\": \"2F\", \n" +
            "            \"sourceShopFloorNum\": 2, \n" +
            "            \"targetShopId\": \"Hn_P00012S00420\", \n" +
            "            \"targetShopName\": \"烤匠\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.3369\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00499\", \n" +
            "            \"sourceShopName\": \"OGAWA\", \n" +
            "            \"sourceShopFloorName\": \"3F\", \n" +
            "            \"sourceShopFloorNum\": 3, \n" +
            "            \"targetShopId\": \"Hn_P00012S00285\", \n" +
            "            \"targetShopName\": \"贝尔机器人\", \n" +
            "            \"targetShopFloorName\": \"3F\", \n" +
            "            \"targetShopFloorNum\": 3, \n" +
            "            \"correlationDegree\": 0.3363\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00520\", \n" +
            "            \"sourceShopName\": \"爱辣啵啵鱼\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00513\", \n" +
            "            \"targetShopName\": \"一只酸奶牛\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.3357\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00262\", \n" +
            "            \"sourceShopName\": \"SHCER\", \n" +
            "            \"sourceShopFloorName\": \"2F\", \n" +
            "            \"sourceShopFloorNum\": 2, \n" +
            "            \"targetShopId\": \"Hn_P00012S00192\", \n" +
            "            \"targetShopName\": \"都会美家\", \n" +
            "            \"targetShopFloorName\": \"2F\", \n" +
            "            \"targetShopFloorNum\": 2, \n" +
            "            \"correlationDegree\": 0.3339\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00317\", \n" +
            "            \"sourceShopName\": \"荣泰\", \n" +
            "            \"sourceShopFloorName\": \"3F\", \n" +
            "            \"sourceShopFloorNum\": 3, \n" +
            "            \"targetShopId\": \"Hn_P00012S00420\", \n" +
            "            \"targetShopName\": \"烤匠\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.3321\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00448\", \n" +
            "            \"sourceShopName\": \"真熙家\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00386\", \n" +
            "            \"targetShopName\": \"吉维亚\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.3303\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00514\", \n" +
            "            \"sourceShopName\": \"弥茶\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00513\", \n" +
            "            \"targetShopName\": \"一只酸奶牛\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.3285\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00228\", \n" +
            "            \"sourceShopName\": \"百变创造力乐高儿童创意中心\", \n" +
            "            \"sourceShopFloorName\": \"2F\", \n" +
            "            \"sourceShopFloorNum\": 2, \n" +
            "            \"targetShopId\": \"Hn_P00012S00230\", \n" +
            "            \"targetShopName\": \"麦当劳\", \n" +
            "            \"targetShopFloorName\": \"2F\", \n" +
            "            \"targetShopFloorNum\": 2, \n" +
            "            \"correlationDegree\": 0.3279\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00230\", \n" +
            "            \"sourceShopName\": \"麦当劳\", \n" +
            "            \"sourceShopFloorName\": \"2F\", \n" +
            "            \"sourceShopFloorNum\": 2, \n" +
            "            \"targetShopId\": \"Hn_P00012S00420\", \n" +
            "            \"targetShopName\": \"烤匠\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.3279\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00418\", \n" +
            "            \"sourceShopName\": \"吉布鲁\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00422\", \n" +
            "            \"targetShopName\": \"贡茶\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.3207\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00410\", \n" +
            "            \"sourceShopName\": \"黄记煌\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00430\", \n" +
            "            \"targetShopName\": \"徐亮胖哥烤蹄\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.3195\n" +
            "        }, \n" +
            "        {\n" +
            "            \"shopSiteId\": \"\", \n" +
            "            \"shopSiteName\": \"\", \n" +
            "            \"sourceShopId\": \"Hn_P00012S00424\", \n" +
            "            \"sourceShopName\": \"C+\", \n" +
            "            \"sourceShopFloorName\": \"4F\", \n" +
            "            \"sourceShopFloorNum\": 4, \n" +
            "            \"targetShopId\": \"Hn_P00012S00416\", \n" +
            "            \"targetShopName\": \"大通冰室\", \n" +
            "            \"targetShopFloorName\": \"4F\", \n" +
            "            \"targetShopFloorNum\": 4, \n" +
            "            \"correlationDegree\": 0.3189\n" +
            "        }\n" +
            "    ], \n" +
            "    \"links\": [\n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00287\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00285\", \n" +
            "            \"value\": \"99.99%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 24\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00416\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00420\", \n" +
            "            \"value\": \"94.58%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 23\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00422\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00420\", \n" +
            "            \"value\": \"91.80%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 22\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00418\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00420\", \n" +
            "            \"value\": \"89.51%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 22\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00272\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00186\", \n" +
            "            \"value\": \"70.89%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 17\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00194\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00192\", \n" +
            "            \"value\": \"61.54%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 15\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00230\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00226\", \n" +
            "            \"value\": \"60.10%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 15\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00378\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00376\", \n" +
            "            \"value\": \"53.59%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 13\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00321\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00420\", \n" +
            "            \"value\": \"51.90%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 12\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00452\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00386\", \n" +
            "            \"value\": \"51.48%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 12\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00516\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00285\", \n" +
            "            \"value\": \"50.33%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 12\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00506\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00404\", \n" +
            "            \"value\": \"49.37%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 12\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00424\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00420\", \n" +
            "            \"value\": \"48.40%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 12\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00516\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00287\", \n" +
            "            \"value\": \"48.22%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 12\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00319\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00420\", \n" +
            "            \"value\": \"47.92%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 11\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00422\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00416\", \n" +
            "            \"value\": \"45.75%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 11\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00450\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00386\", \n" +
            "            \"value\": \"45.03%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 11\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00402\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00404\", \n" +
            "            \"value\": \"44.73%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 11\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00325\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00420\", \n" +
            "            \"value\": \"43.64%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 10\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00388\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00446\", \n" +
            "            \"value\": \"41.35%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 10\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00418\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00416\", \n" +
            "            \"value\": \"40.99%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 10\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00438\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00404\", \n" +
            "            \"value\": \"40.81%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 10\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00497\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00420\", \n" +
            "            \"value\": \"39.54%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 9\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00402\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00438\", \n" +
            "            \"value\": \"38.88%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 9\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00279\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00285\", \n" +
            "            \"value\": \"37.97%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 9\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00260\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00194\", \n" +
            "            \"value\": \"36.23%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 9\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00436\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00404\", \n" +
            "            \"value\": \"36.17%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 9\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00390\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00446\", \n" +
            "            \"value\": \"35.62%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00190\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00192\", \n" +
            "            \"value\": \"35.38%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00371\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00279\", \n" +
            "            \"value\": \"35.38%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00325\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00226\", \n" +
            "            \"value\": \"35.26%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00518\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00506\", \n" +
            "            \"value\": \"34.90%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00325\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00321\", \n" +
            "            \"value\": \"34.54%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00321\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00226\", \n" +
            "            \"value\": \"34.18%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00518\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00404\", \n" +
            "            \"value\": \"34.00%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00144\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00226\", \n" +
            "            \"value\": \"33.94%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00232\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00226\", \n" +
            "            \"value\": \"33.88%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00321\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00230\", \n" +
            "            \"value\": \"33.76%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00226\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00420\", \n" +
            "            \"value\": \"33.69%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00499\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00285\", \n" +
            "            \"value\": \"33.63%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00520\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00513\", \n" +
            "            \"value\": \"33.57%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00262\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00192\", \n" +
            "            \"value\": \"33.39%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00317\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00420\", \n" +
            "            \"value\": \"33.21%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00448\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00386\", \n" +
            "            \"value\": \"33.03%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00514\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00513\", \n" +
            "            \"value\": \"32.85%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00228\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00230\", \n" +
            "            \"value\": \"32.79%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00230\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00420\", \n" +
            "            \"value\": \"32.79%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00418\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00422\", \n" +
            "            \"value\": \"32.07%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 8\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00410\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00430\", \n" +
            "            \"value\": \"31.95%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 7\n" +
            "            }\n" +
            "        }, \n" +
            "        {\n" +
            "            \"id\": null, \n" +
            "            \"name\": null, \n" +
            "            \"symbolSize\": null, \n" +
            "            \"source\": \"Hn_P00012S00424\", \n" +
            "            \"category\": null, \n" +
            "            \"target\": \"Hn_P00012S00416\", \n" +
            "            \"value\": \"31.89%\", \n" +
            "            \"lineStyle\": {\n" +
            "                \"width\": 7\n" +
            "            }\n" +
            "        }\n" +
            "    ]\n" +
            "}\n";
}
