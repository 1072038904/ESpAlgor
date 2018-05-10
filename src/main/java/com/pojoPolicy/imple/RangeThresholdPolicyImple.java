package com.pojoPolicy.imple;

import com.pojo.Hot;
import com.pojo.RangeThreshold;
import com.pojoPolicy.RangeThresholdPolicy;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RangeThresholdPolicyImple implements RangeThresholdPolicy {


    @Override
    public List<List<RangeThreshold>> divideHotsByTiemthreshold(List<Hot> hots, int timeThreshold) {
        //初始化12个clusters
        for (Iterator<Hot> it = hots.iterator(); it.hasNext(); ) {

        }
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
}
