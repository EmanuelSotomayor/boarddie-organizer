package com.hex4w0rd.boarddie.services;

import com.hex4w0rd.boarddie.dto.BoardDTO;
import com.hex4w0rd.boarddie.dto.ColumnDTO;
import com.hex4w0rd.boarddie.request.BoardUpdateRequest;
import org.springframework.data.domain.Page;

public interface IBoardService {
    BoardDTO saveBoard(BoardDTO boardDTO);
    BoardDTO updateBoardById(Long id, BoardUpdateRequest boardUpdateRequest);
    Boolean deleteBoardById(Long id);
    BoardDTO getBoardById(Long id);
    Page<BoardDTO> getAllBoards();
    Boolean updateBoardFavoriteStatus(Boolean check);
    Boolean addColumnToBoard(Long boardId, ColumnDTO columnDTO);
    Boolean deleteColumnOfBoard(Long boardId, Long columnId);
    Boolean updateColumnOfBoard(Long boardId, Long columnId, ColumnDTO columnDTO);
}