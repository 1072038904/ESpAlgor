package com.pojoPolicy.imple;

import com.pojo.RangeThreshold;
import com.pojo.Hot;
import com.pojoPolicy.RangeThresholdPolicy;

import java.util.List;

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
}
