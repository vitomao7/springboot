

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Iotek在线书店</title>
    <style type="text/css" media="screen">
        @import url('css/common.css');
        @import url('css/index.css');
        @import url('css/nav_right.css');
    </style>
    <!--|　|-->
</head>
<body>
    <header id="p_header">
        Iotek在线书店
        <div></div>
    </header>
     <article>
        <header>
           图书列表
        </header>
        
        <#list books as book>
        <figure>
        	${book_index+1}
            <a href="DetailServlet.do?bookId=${book.bookId! }"><img src="${book.bookPic! }"></a>
            <footer>${book.bookName! } 单价:${book.bookIsbn! }</footer>
            <figcaption>
                这是一本好图书
            </figcaption>
        </figure>       
        </#list>

        
        <nav class="list_nav">
            <div class="next"></div>
            <a href="index.html#top">1</a>
            <a href="index.html#top">2</a>
            <a href="index.html#top">3</a>
            <a href="index.html#top">4</a>
            <a href="index.html#top">5</a>
            <a href="index.html#top">7</a>
            <a href="index.html#top">20</a>
            <div class="previous"></div>
        </nav>
    </article> 
    
    
    
    <article class="right">
    <form action="#" method="get" class="search" accept-charset="utf-8">
        <input type="text" name="content">
        <button type="submit">搜索</button>
    </form>
    <nav>
        <header>管理</header>
        <ul>
            <li><a href="pages/login_register.html">登录或注册</li>
            <li><a href="manager.jsp">用户管理</a></li>
            <li>
                <a href="pages/manager.html#conent/order/order.html">订单管理</a>
            </li>
        </ul>
    </nav>
    <section>
        <header>购物车</header>
        <ul>
            <li>JavaOOP
                <ul>
                <li>编号:001</li>
                <li>数量:2</li>
                <li>小记:¥204</li>
                <li class="operator"><a href="">删除</a></li>
                </ul>
            </li>
            <li>javaEE
                <ul>
                <li>编号:002</li>
                <li>数量:1</li>
                <li>小记:¥104</li>
                <li class="operator"><a href="">删除</a></li>
                </ul>
            </li>
        </ul>
        <footer>
            合计: ¥308
            <button   onclick="document.location.href='pages/manager.html#conent/order/cart.html'">
                提交
            </button>
        </footer>
    </section>
    </article>  
    <footer id="p_footer">
        <div></div>
        @Copyright <strong>iotek科技有限公司</strong>
    </footer>
</body>
</html>