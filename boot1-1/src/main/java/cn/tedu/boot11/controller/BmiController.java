package cn.tedu.boot11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class BmiController {
    @RequestMapping("bmi")
    @ResponseBody
    public String bmi(float height,float weight){
        float bmi = weight/(height*height);
        if (bmi<18.5){
            return "兄弟你瘦了";
        }if (bmi<24){
            return "恭喜你,体重正常";
        }if(bmi<28){
            return "微微胖";
        }return "有点胖";
    }
}
