function postinfo(data){
	if(data==null||data==""){
		layer.msg('请输入仓库号后再查询！',{icon:5,time:1500}); 
		return;
	}
	layer.open({
		  type: 2,
		  title:'查询到仓库号为'+data+'的仓库',
		  skin: 'layui-layer-demo', //样式类名
		  shadeClose: true, //开启遮罩关闭
		  area: ['800px','450px'],
		  content: "storeWhinfo/selectInfo.do?whid="+data
		});
}	

function getGoods(data){
	layer.open({
		  type: 2,
		  title:'仓库'+data+'中的商品',
		  skin: 'layui-layer-demo', //样式类名
		  shadeClose: true, //开启遮罩关闭
		  area: ['1000px','450px'],
		  content: "storeWhinfo/listpageSgi.do?whid="+data
		});
}


function postUpdate(data){
	console.log(window.location.href);
	var url="storeWhinfo/selectSwi.do?whid="+data;
	parent.location.href=url;
}


function delCheck(whid){
	layui.use('layer',function(){
		  layer.confirm(
				  '删除仓库可能会引发错误，您真的确定要删除该仓库吗？',
				  { icon: 7, title: '警告' },
				  function (index) {
					//页面跳转向控制器传递参数
					  $.ajax({
							type:'post',
							data:{"whid":whid},
							url:'storeWhinfo/delSwi.do',
							success:function(res){
								layer.msg('删除成功！', {icon: 1,time:1000});
								setTimeout(function(){layer.load(1);},1000);
								setTimeout(function(){window.location.reload();},1500);
							}
						})
					layer.close(index);
	});
});
	
	
	
	
}
  
