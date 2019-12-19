layui.use('laypage', function(){
  var laypage = layui.laypage;
  laypage.render({
	    elem: 'demo7'
	    ,count: $('#total').val()
	    ,layout: ['count', 'prev', 'page', 'next', 'limit', 'refresh', 'skip']
	    ,jump: function(obj,first){
	      if(!first){
	    	  var url="storefinfo/listpage.do?pageNum="+obj.pages+"&pageSize="+obj.limit;
	    	  obj.curr=obj.pages;
              window.location.href = url;
	      }
	    }
	  });
});

function ajaxPost(data){
  $.ajax({
  type: 'post',
  url: "storefinfo/delStore.do",
  data: "gid="+data,
  success: function (res) {
	  console.log(res);
	  layer.msg("删除成功",{icon:6,time:800});
  }
  });
  }




function delCheck(data){
	layui.use('layer',function(){
	  console.log(data);
	  layer.confirm(
			  '您确定要删除该记录？',
			  { icon: 3, title: '提示' },
			  function (index) {
				//页面跳转向控制器传递参数
				ajax_post(data);
				layer.close(index);
			  });
	});
}
  




      

;