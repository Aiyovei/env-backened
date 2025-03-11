package com.env.envbackend.Controller;

import com.env.envbackend.Service.DisinfectantInfoService;
import com.env.envbackend.pojo.DisinfectantInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 消毒剂信息;(DISINFECTANT_INFO)表控制层

 */
@Api(tags = "消毒剂信息对象功能接口")
@RestController
@RequestMapping("/disinfectantInfo")
public class DisinfectantInfoController{
    @Autowired
    private DisinfectantInfoService disinfectantInfoService;

    /**
     * 通过ID查询单条数据
     *
     * @param disinfectantId 主键
     * @return 实例对象
     */
    @ApiOperation("通过ID查询单条数据")
    @GetMapping("{disinfectantid}")
    public ResponseEntity<DisinfectantInfo> queryById(String disinfectantId){
        return ResponseEntity.ok(disinfectantInfoService.queryById(disinfectantId));
    }

    /**
     * 分页查询
     *
     * @param disinfectantInfo 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @ApiOperation("分页查询")
    @GetMapping
    public ResponseEntity<Page<DisinfectantInfo>> paginQuery(DisinfectantInfo disinfectantInfo, PageRequest pageRequest){
        return ResponseEntity.ok(disinfectantInfoService.paginQuery(disinfectantInfo, pageRequest));
    }

    /**
     * 新增数据
     *
     * @param disinfectantInfo 实例对象
     * @return 实例对象
     */
    @ApiOperation("新增数据")
    @PostMapping
    public ResponseEntity<DisinfectantInfo> add(DisinfectantInfo disinfectantInfo){
        return ResponseEntity.ok(disinfectantInfoService.insert(disinfectantInfo));
    }

    /**
     * 更新数据
     *
     * @param disinfectantInfo 实例对象
     * @return 实例对象
     */
    @ApiOperation("更新数据")
    @PutMapping
    public ResponseEntity<DisinfectantInfo> edit(DisinfectantInfo disinfectantInfo){
        return ResponseEntity.ok(disinfectantInfoService.update(disinfectantInfo));
    }

    /**
     * 通过主键删除数据
     *
     * @param disinfectantId 主键
     * @return 是否成功
     */
    @ApiOperation("通过主键删除数据")
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(String disinfectantId){
        return ResponseEntity.ok(disinfectantInfoService.deleteById(disinfectantId));
    }
    @GetMapping("getByFactoryId/{factoryId}")
    @ResponseBody
    public List<DisinfectantInfo> getByFactoryId(@PathVariable Integer factoryId){
//        System.out.println(1);
//    return "1";
        return disinfectantInfoService.queryDailyEmissionFactoryId(factoryId);
    }

}