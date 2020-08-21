package com.example.demo1;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.carzone.erp.order.api.facade.SaleOrderFacade;
import com.carzone.erp.order.api.model.AddSaleOrderDetailsInVO;
import com.carzone.erp.order.api.model.DeleteSaleOrderDetailsInVO;
import com.carzone.erp.order.api.model.UpdateSaleOrderDetailInVO;
import com.carzone.exception.CarzoneBusinessException;
import com.carzone.order.api.domain.order.local.param.SaleOrderRequestDto;
import com.carzone.order.api.domain.order.local.saleorder.SaleOrderDetailDto;
import com.carzone.order.api.domain.order.local.saleorder.SaleOrderPageResultDto;
import com.carzone.order.api.domain.platform.PlatformOrderPageVo;
import com.carzone.order.api.domain.platform.PlatformOrderRo;
import com.carzone.order.api.local.OnlineOrderService;
import com.carzone.order.api.local.PlatformOrderService;
import com.carzone.order.api.local.ReturnOrderOperateService;
import com.carzone.order.api.local.SaleOrderService;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zhouhe.Person2;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutionException;

@RunWith(SpringRunner.class)
@SpringBootTest
class Demo1ApplicationTests {

    @Reference(group = "test", url = "dubbo://localhost:33261", timeout = 100000, check = false)
    private SaleOrderFacade saleOrderFacade;
    @Reference(group = "test", url = "dubbo://localhost:33261", timeout = 100000, check = false)
    private SaleOrderService saleOrderService;
    //@Reference(group = "pre", url = "dubbo://172.26.169.136:33261", timeout = 100000)
    //@Reference(group = "test", url = "dubbo://172.26.116.171:33261", timeout = 100000, check = false)
    @Reference(group = "test", url = "dubbo://localhost:33261", timeout = 100000, check = false)
    private ReturnOrderOperateService returnOrderOperateService;
    @Reference(group = "test", url = "dubbo://localhost:33261", timeout = 100000, check = false)
    private OnlineOrderService onlineOrderService;
    @Reference( url = "dubbo://localhost:33261",timeout = 100000, check = false)
    private PlatformOrderService platformOrderService;

    @Test
    public void test() throws Exception {
        UpdateSaleOrderDetailInVO updateSaleOrderDetailInVO = new UpdateSaleOrderDetailInVO();
        updateSaleOrderDetailInVO.setBizOrderId("XSD04931213656");
        updateSaleOrderDetailInVO.setOrderStatus(101);
        updateSaleOrderDetailInVO.setAccId("000002");
        updateSaleOrderDetailInVO.setInitPrice(new BigDecimal("0.01"));
        updateSaleOrderDetailInVO.setInitPriceUpdateFlag(true);
        updateSaleOrderDetailInVO.setRelationSkus(Lists.newArrayList("000004"));
        updateSaleOrderDetailInVO.setUserId("321631");
        updateSaleOrderDetailInVO.setOrderSysChannel(1);
        saleOrderFacade.updateSaleOrderDetailInfoAndBuildGiftRelation(updateSaleOrderDetailInVO);

    }

    @Test
    public void test2() throws Exception {
      /*  SaleOrderRequestDto saleOrderRequestDto = new SaleOrderRequestDto();
        saleOrderRequestDto.setBusinessOrderId("XSD04931213664");
        saleOrderRequestDto.setBeginTime(new SimpleDateFormat("yyyy-MM-dd").parse("2020-01-01"));
        saleOrderRequestDto.setEndTime(new SimpleDateFormat("yyyy-MM-dd").parse("2020-01-01"));
        saleOrderRequestDto.setWarehouseIds(Lists.newArrayList("0493"));
        SaleOrderPageResultDto saleOrderPageResultDto = saleOrderService.querySaleOrders(saleOrderRequestDto);
        System.out.println(JSON.toJSONString(saleOrderPageResultDto));*/

       /* SaleOrderDetailDto saleOrderDetailDto = saleOrderService.querySaleOrderDetail(23795108282477L);
        System.out.println(JSON.toJSONString(saleOrderDetailDto));*/
        /*saleOrderFacade.purchaseLimit("300018243", Lists.newArrayList("723695"));
       saleOrderFacade.purchaseLimit("300018243", Lists.newArrayList("723695","063542","083302","113750","1165090","1131767"));*/
        onlineOrderService.sign(23795108282477L);
    }

    @Test
    public void test3() throws Exception {
        System.out.println(returnOrderOperateService.confirm(Lists.newArrayList(23523134737402L), "sys"));
    }


    @Test
    public void test4() throws InterruptedException, ExecutionException, CarzoneBusinessException {
        saleOrderFacade.querySaleReturnConfirmByOrderId(1L);
    }
}
