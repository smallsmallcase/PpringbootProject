package com.huj.sell.utils;

import com.huj.sell.view.ResultVO;

/**
 * Package: com.huj.sell.utils
 * Author: smallcase
 * Date: Created in 2018/6/1 20:56
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setMsg("成功");
        resultVO.setCode(0);
        return resultVO;
    }


    public static ResultVO success(){
        return success(null);
    }


    public static ResultVO error(Integer code, String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
