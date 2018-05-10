package com.pojoPolicy.imple;

import com.pojo.RangeThreshold;
import com.pojo.Hot;
import com.pojoPolicy.RangeThresholdPolicy;
import org.w3c.dom.ranges.Range;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RangeThresholdPolicyImple implements RangeThresholdPolicy {


    @Override
    public List<List<RangeThreshold>> divideHotsByTiemthreshold(List<Hot> hots, int timeThreshold) {
       //初始化12个clusters
        return null;
    }

    @Override
    public int CalculateSequenceDifference(List<RangeThreshold> rangeThresholds, int difference) {
        int size = rangeThresholds.size();
        int result = difference * size;
        return 0;
    }

    @Override
    public Map<String, Hot> initializeClusters() {

        return null;
    }

    @Override
    public Map<String, List<Hot>> mainAnalysis() {

        return null;
    }
}
