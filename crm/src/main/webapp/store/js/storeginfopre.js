
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