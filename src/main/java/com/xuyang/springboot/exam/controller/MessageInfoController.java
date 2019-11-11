package com.xuyang.springboot.exam.controller;

import com.xuyang.springboot.exam.model.MessageInfo;
import com.xuyang.springboot.exam.service.MessageInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Auther: xuyang
 * @Date: 2019/11/12 00:28
 * @Description:
 */
@Slf4j
@Controller
public class MessageInfoController {

    @Autowired
    private MessageInfoService messageInfoService;

    @RequestMapping(value = "messageList", method = RequestMethod.GET)
    public String messageList(@RequestParam(required = false)MessageInfo messageInfo, Model model) throws Exception{
        log.debug("留言管理界面");
        List<MessageInfo> messageInfoList = messageInfoService.getMessageInfoList(messageInfo);
        model.addAttribute("messageInfoList", messageInfoList);
        return "message/message_list";
    }

    @RequestMapping(value = "getMessageInfoUpdate", method = RequestMethod.GET)
    public String getMessageInfoUpdate(MessageInfo messageInfo, Model model) throws Exception{
        log.debug("留言管理界面");
        MessageInfo messageInfos = messageInfoService.getMessageInfo(messageInfo);
        model.addAttribute("messageInfo", messageInfos);
        return "message/message_update";
    }

    @RequestMapping(value = "messageInfoUpdate", method = RequestMethod.POST)
    public String messageInfoUpdate(MessageInfo messageInfo, Model model) throws Exception{
        log.debug("留言管理界面");
        messageInfoService.updateMessageInfo(messageInfo);
        model.addAttribute("messageInfo", messageInfo);
        return "message/message_update";
    }

    @RequestMapping(value = "messageInfoDelete", method = RequestMethod.GET)
    public String messageInfoDelete(MessageInfo messageInfo, Model model) throws Exception{
        log.debug("留言管理界面");
        messageInfoService.deleteMessageInfo(messageInfo);
        List<MessageInfo> messageInfoList = messageInfoService.getMessageInfoList(messageInfo);
        model.addAttribute("messageInfoList", messageInfoList);
        return "message/message_list";
    }
}
