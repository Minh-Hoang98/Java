<jsp:useBean id="counter" class="model.Counter" scope="application" />
<footer>
    <p>Hit counter ${applicationScope.counter.count }&copy; Copyright ${currentYear} FPT University. 
            All rights reserved.</p>
    </footer>
</body>
</html>