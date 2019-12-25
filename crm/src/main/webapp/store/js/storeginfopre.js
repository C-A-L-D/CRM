function ajaxPost(data){
  $.ajax({
  type: 'post',
  url: "storeGinfo/delStore.do?gid="+data,
  success: function (res) {
	  console.log(res);
	  layer.msg("删除成功",{icon:6,time:1000});
	  setTimeout(function(){layer.load(1);},1000);
  },
  errer:function (res) {
	  console.log(res);
	  layer.msg("删除失败",{icon:2,time:1000});
	  setTimeout(function(){layer.load(1);},1000);
  }
  });
  setTimeout(function(){parent.location.reload();},1500);
  }

function postinfo(data,name){
	if(name==""||name==null){
		name='号为"'+data+'"';
	}else{
		name='"'+name+'"';
	}
	if(data==""||data==null){
		  layui.use('layer',function(){
			  var layer=layui.layer;
			  layer.msg("请输入商品id！",{icon:5,time:1000,offset:250});
		  });
	}else{
		layer.open({
			type: 2,
			title:'商品'+name+'的详情',
			skin: 'layui-layer-demo', //样式类名
			shadeClose: true, //开启遮罩关闭
			offset: '10px',
			area: ['1000px','500px'],
			content: "storeGinfo/selectInfo.do?gid="+data,
		});
	}
}

function postUpdate(data){
	var data=data;
	  if(data==""||data==null){
		  layui.use('layer',function(){
			  var layer=layui.layer;
			  layer.msg("该商品不存在！",{icon:2,time:1000,offset:100});
		  });
		  setTimeout(function(){parent.location.reload();},1500);
	}else{
		parent.location.href="storeGinfo/selectSgi.do?gid="+data;
	}
}


function delCheck(data){
	layui.use('layer',function(){
	  console.log(data);
	  layer.confirm(
			  '您确定要删除该记录？',
			  { icon: 3, title: '提示' },
			  function (index) {
				//页面跳转向控制器传递参数
				ajaxPost(data);
				layer.close(index);
			  });
	});
}
  




      

;