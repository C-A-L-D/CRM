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
	if(data==null){
		layui.use('layer',function(){
			layer.msg('该仓库不存在！', {icon: 5,time:1200});
		});
		setTimeout(function(){parent.location.reload();},1200);
		return;
	}
	console.log(window.location.href);
	var url="storeWhinfo/selectSwi.do?whid="+data;
	parent.location.href=url;
}

function delCheck(whid){
	var whid=whid;
	layui.use('layer',function(){
		  layer.confirm(
				  '删除仓库可能会引发错误，您真的确定要删除该仓库吗？',
				  { icon: 7, title: '警告' },
				  function (index) {
					//页面跳转向控制器传递参数
					 checknull(whid);
					 layer.close(index);
				  });
	});
}
	
function checknull(whid){
	$.ajax({
		type:'post',
		data:{"whid":whid},
		url:'storeWhinfo/hasSgi.do',
		success:function(data){ 
			if(data.status==1){
				movesgi(whid);
			}else{
				delnull(whid);
			}
		}
	});
}

function delnull(whid){
	 $.ajax({
		  type:'post',
		  data:{"whid":whid},
		  url:"storeWhinfo/delSwi.do",
		  success:function(res){
			  layer.msg('删除空仓库成功！', {icon: 1,time:1000});
			  setTimeout(function(){layer.load(1);},1000);
			  setTimeout(function(){window.location.reload();return;},1100);
		  }
 })
}

function movesgi(rswhid){
	layer.confirm('您要删除的仓库内存在商品，如果您仍要删除的话，请在稍后的输入框中填入您要转移的仓库号。如果您需要系统自动分配，请在输入框中填入auto', {icon: 7, title:'提示'}, function(index){
	  layer.prompt({
		  title: '请输入要转移的仓库号：',
		}, function(towhid, index, elem){
			if(towhid=='auto'){
				towhid="";
			}
			 $.ajax({
					type:'post',
					data:{"rswhid":rswhid,"towhid":towhid},
					url:'storeWhinfo/moveSgi.do',
					success:function(res){
						switch(res.status){
							case 200:{
								layer.msg('删除仓库'+rswhid+'成功,已将仓库号'+rswhid+'中的商品成功转移到仓库'+towhid+'中！', {icon: 1,time:1700});
								break;
							}
							case 301:{
								layer.msg('删除仓库'+rswhid+'成功,但您输入的新仓库号不存在,已自动转移商品', {icon: 7,time:1700});
								break;
							}
							case 300:{
								layer.msg('删除仓库'+rswhid+'成功,已自动转移商品！', {icon: 6,time:1700});
								break;
							}
							case 400:{
								layer.msg('删除仓库失败，没有新的仓库可用！', {icon: 5,time:1700});
								break;
							}
							default:{
								layer.msg('删除仓库失败，发生未知错误！', {icon: 2,time:1700});
								break;
							}
						}
						setTimeout(function(){layer.load(1);},1700);
						setTimeout(function(){window.location.reload();},1800);
					}
				})
		  layer.close(index);
		});
	  layer.close(index);
	});
}
	
	
  
