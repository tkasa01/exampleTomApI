package main.java.controllers;

import main.java.database.Database;
import main.java.models.Comments;
import main.java.models.Offers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CommentsService {

    private Map<Integer,Offers> commentsMap  = Database.getOffers();

    public CommentsService(){
        commentsMap.put(1, new Offers( 1, "very good desc vas on the sale.", "Alice",56));
        commentsMap.put(2, new Offers(2,"car", "white, big car on the sale!", 12000.50));
    }

    public List<Comments> getAllComments(int commentId) {
        Map<Integer, Comments> comments = commentsMap.get(commentId).getComments();
        return new ArrayList<Comments>(comments.values());
    }

    public Comments getComment(int offerId, int commentId) {
        Map<Integer, Comments> comments = commentsMap.get(offerId).getComments();
        return comments.get(commentId);
    }

    public Comments addComment(int offerId, Comments newComment){
        Map<Integer, Comments> comments = commentsMap.get(offerId).getComments();
        newComment.setId(comments.size()+ 1);
        comments.put(newComment.getId(), newComment);
        return newComment;
    }

    public Comments updateComment(int offerId, Comments comment) {
        Map<Integer, Comments> commentCollection = commentsMap.get(offerId).getComments();
        if(comment.getId() <= 0){
            return null;
        }
        commentCollection.put(comment.getId(), comment);
        return comment;
    }

    public Comments removeComment(int offerId, int commentId) {
        Map<Integer, Comments> commentsCollection = commentsMap.get(offerId).getComments();
        return commentsCollection.remove(commentId);
    }
}
