<?php
    include("conexao.php");

    if(isset($_POST['user_comm']) && isset($_POST['user_name'])) {
        $comment = $_POST['user_comm'];
        $name    = $_POST['user_name'];
        $insert  = mysqli_query($conn, "INSERT INTO comments (name, comment, post_time) VALUES ('$name', '$comment', CURRENT_TIMESTAMP)");

        $id     = mysqli_insert_id($conn);
        $select = mysqli_query($conn, "SELECT * FROM comments WHERE name='$name' AND comment='$comment' ");
        
        if($row = mysqli_fetch_array($select)) {
            $name    = $row['name'];
            $comment = $row['comment'];
            $time    = $row['post_time'];
?>

    <div class="comment_div">
        <p class="name"><strong>Postado por: </strong> <?php echo $name;?> <span style="float:right"><?php echo date("j/m/Y g:ia", strtotime($time)) ?></span></p>
        <p class="comments"><?php echo $comment;?></p>	
        <hr>
    <div> <!-- end comment_div -->
    

<?php
    } //end if
    exit();
    } //end if
?>