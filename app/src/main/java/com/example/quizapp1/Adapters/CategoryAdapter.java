package com.example.quizapp1.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizapp1.Models.CategoryModel;
import com.example.quizapp1.R;
import com.example.quizapp1.SetsActivity;
import com.example.quizapp1.databinding.ItemCategoryBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.viewHolder>{

   Context context;
   ArrayList<CategoryModel>list;

   public CategoryAdapter(Context context, ArrayList<CategoryModel> list) {
      this.context = context;
      this.list = list;
   }

   @NonNull
   @Override
   public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(context).inflate(R.layout.item_category,parent,false);
      return new viewHolder(view);
   }

   @Override
   public void onBindViewHolder(@NonNull viewHolder holder, int position) {
      CategoryModel model = list.get(position);

      holder.binding.categoryName.setText(model.getCategoryName());

      Picasso.get()
              .load(model.getCategoryImage())
              .placeholder(R.drawable.placeholder)
              .into(holder.binding.categoryImages);

      holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

            Intent intent = new Intent(context, SetsActivity.class);
            intent.putExtra("category",model.getCategoryName());
            intent.putExtra("sets",model.getSetnum());
            intent.putExtra("key",model.getKey());

            context.startActivity(intent);


         }
      });



   }

   @Override
   public int getItemCount() {
      return list.size();
   }

   public class viewHolder extends RecyclerView.ViewHolder {

      ItemCategoryBinding binding;
      public viewHolder(@NonNull View itemView) {
         super(itemView);

         binding = ItemCategoryBinding.bind(itemView);

      }
   }



}
