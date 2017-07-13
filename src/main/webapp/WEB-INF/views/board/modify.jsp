<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 수정</title>
<%@ include file="board_header.jsp" %>
<script>
    $(document).ready(function(){
    	$("select[name='boardCategory']").val('${BoardDTO.boardCategory}');
    	 
    	$("#btnSave").click(function(){
            var boardTitle = $("#boardTitle").val();
            var boardCategory = $("select[name='boardCategory']").val();
            var boardContent = $("#boardContent").val();
            
            if(boardTitle == ""){
                alert("제목을 입력하세요");
                document.boardWriteForm.boardTitle.focus();
                return;
            }
            if(boardCategory == "checking"){
                alert("카테고리를 선택하세요");
                document.boardWriteForm.boardCategory.focus();
                return;
            }
            if(boardContent == ""){
                alert("내용을 입력하세요");
                document.boardWriteForm.boardContent.focus();
                return;
            }
        
        });
        
        $("#btnBack").click(function(){
        	location.href = "${path}/board/view?boardNum=${BoardDTO.boardNum}";
        });
    });
</script>
</head>
<body>
	<h1>글 수정하기</h1>
	<form name="boardUpdateForm" method="post" action="${path}/board/update?boardNum=${BoardDTO.boardNum}">
	    <div>
	        	제목 <input type="text" name="boardTitle" id="boardTitle" size="80" value="${BoardDTO.boardTitle }" >
	    </div>
	    <div>
	        	카테고리 <select name="boardCategory">
	        				<option value="checking">--선택해주세요--</option>
	        				<option value="공지">공지</option>
	        				<option value="학사">학사</option>
	        				<option value="장학">장학</option>
	        				<option value="졸업">졸업</option>
	        				<option value="모집">모집</option>
	        		  </select>
	    </div>
	    <div>
	      	  내용 <textarea name="boardContent" id="boardContent" rows="5" cols="80" >${BoardDTO.boardContent }</textarea>
	    </div>
	    <hr/>
	    <div>
	    	첨부파일  <input type="file">
	    </div>
	    <br/><br/>
	    
	    <div style="width:650px; text-align: center;">
	        <button type="submit" id="btnSave">수정완료</button>
	        <button type="button" id="btnBack">돌아가기</button>
	    </div>
	</form>
</body>
</html>